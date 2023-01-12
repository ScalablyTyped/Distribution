package typings.autogypi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("autogypi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(opts: GenerateOptions, config: AutogypiConfig): typings.bluebird.mod.^[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(opts.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Array[js.Object]]]
  
  inline def initGyp(opts: BindingConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initGyp")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def writeJson(outputPath: String, json: Any): typings.bluebird.mod.^[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(outputPath.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Object]]
  inline def writeJson(outputPath: String, json: Any, name: String): typings.bluebird.mod.^[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(outputPath.asInstanceOf[js.Any], json.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Object]]
  inline def writeJson(outputPath: String, json: Any, name: String, header: String): typings.bluebird.mod.^[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(outputPath.asInstanceOf[js.Any], json.asInstanceOf[js.Any], name.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Object]]
  inline def writeJson(outputPath: String, json: Any, name: Unit, header: String): typings.bluebird.mod.^[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(outputPath.asInstanceOf[js.Any], json.asInstanceOf[js.Any], name.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[js.Object]]
  
  trait AutogypiConfig extends StObject {
    
    /** List of required Node.js modules. */
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Additional gypi files to include inside relevant targets. */
    var includes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Path to auto.gypi to generate. */
    var output: js.UndefOr[String] = js.undefined
    
    /** Path to auto-top.gypi to generate. */
    var outputTop: js.UndefOr[String] = js.undefined
    
    /** Additional gypi files to include at top level. */
    var topIncludes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AutogypiConfig {
    
    inline def apply(): AutogypiConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutogypiConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutogypiConfig] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputTop(value: String): Self = StObject.set(x, "outputTop", value.asInstanceOf[js.Any])
      
      inline def setOutputTopUndefined: Self = StObject.set(x, "outputTop", js.undefined)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setTopIncludes(value: js.Array[String]): Self = StObject.set(x, "topIncludes", value.asInstanceOf[js.Any])
      
      inline def setTopIncludesUndefined: Self = StObject.set(x, "topIncludes", js.undefined)
      
      inline def setTopIncludesVarargs(value: String*): Self = StObject.set(x, "topIncludes", js.Array(value*))
    }
  }
  
  trait BindingConfig extends StObject {
    
    /** Directory where the binding.gyp will be stored. */
    var basePath: String
    
    /** Absolute path to generated auto.gypi to include in default target. */
    var outputPath: String
    
    /** Absolute path to generated auto-top.gypi to include at top level. */
    var outputTopPath: String
    
    /** List of absolute paths to C/C++ source files to compile. */
    var sourceList: js.Array[String]
  }
  object BindingConfig {
    
    inline def apply(basePath: String, outputPath: String, outputTopPath: String, sourceList: js.Array[String]): BindingConfig = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], outputTopPath = outputTopPath.asInstanceOf[js.Any], sourceList = sourceList.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindingConfig] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputTopPath(value: String): Self = StObject.set(x, "outputTopPath", value.asInstanceOf[js.Any])
      
      inline def setSourceList(value: js.Array[String]): Self = StObject.set(x, "sourceList", value.asInstanceOf[js.Any])
      
      inline def setSourceListVarargs(value: String*): Self = StObject.set(x, "sourceList", js.Array(value*))
    }
  }
  
  trait GenerateOptions extends StObject {
    
    /** Absolute path to autogypi.json. */
    var configPath: String
    
    /** Absolute path to auto.gypi to generate. */
    var outputPath: String
    
    /** Absolute path to auto-top.gypi to generate. */
    var outputTopPath: String
  }
  object GenerateOptions {
    
    inline def apply(configPath: String, outputPath: String, outputTopPath: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], outputTopPath = outputTopPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputTopPath(value: String): Self = StObject.set(x, "outputTopPath", value.asInstanceOf[js.Any])
    }
  }
}
