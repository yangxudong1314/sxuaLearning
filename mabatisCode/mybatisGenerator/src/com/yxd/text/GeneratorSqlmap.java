package com.yxd.text;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**   
 * @Title: GeneratorSqlmap.java 
 * @Package po 
 * @Description:
 * @author 杨旭东
 * @date 2017年8月14日 下午8:02:24 
 * @version V1.0   
 */
public class GeneratorSqlmap {
	public void generator()throws Exception{

	      List<String>warnings = new ArrayList<String>();

	      boolean overwrite =true;

	      File configFile = new File("generatorConfig.xml");

	      ConfigurationParser cp = new ConfigurationParser(warnings);

	      Configuration config = cp.parseConfiguration(configFile);

	      DefaultShellCallback callback = new DefaultShellCallback(overwrite);

	      MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,

	            callback,warnings);

	      myBatisGenerator.generate(null);

	   }
	public static void main(String[] args) throws Exception {

		try {

			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();

			generatorSqlmap.generator();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}