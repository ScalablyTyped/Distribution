package typings.args

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("args", JSImport.Namespace)
  @js.native
  val ^ : typings.args.mod.args = js.native
  
  trait ConfigurationOptions extends StObject {
    
    var help: js.UndefOr[Boolean] = js.undefined
    
    var mainColor: String | js.Array[String]
    
    var minimist: js.UndefOr[MinimistOptions] = js.undefined
    
    var mri: MriOptions
    
    var name: js.UndefOr[String] = js.undefined
    
    var subColor: String | js.Array[String]
    
    var usageFilter: js.UndefOr[js.Function1[/* output */ Any, Any]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurationOptions {
    
    inline def apply(mainColor: String | js.Array[String], mri: MriOptions, subColor: String | js.Array[String]): ConfigurationOptions = {
      val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setMainColor(value: String | js.Array[String]): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
      
      inline def setMainColorVarargs(value: String*): Self = StObject.set(x, "mainColor", js.Array(value*))
      
      inline def setMinimist(value: MinimistOptions): Self = StObject.set(x, "minimist", value.asInstanceOf[js.Any])
      
      inline def setMinimistUndefined: Self = StObject.set(x, "minimist", js.undefined)
      
      inline def setMri(value: MriOptions): Self = StObject.set(x, "mri", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubColor(value: String | js.Array[String]): Self = StObject.set(x, "subColor", value.asInstanceOf[js.Any])
      
      inline def setSubColorVarargs(value: String*): Self = StObject.set(x, "subColor", js.Array(value*))
      
      inline def setUsageFilter(value: /* output */ Any => Any): Self = StObject.set(x, "usageFilter", js.Any.fromFunction1(value))
      
      inline def setUsageFilterUndefined: Self = StObject.set(x, "usageFilter", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Example extends StObject {
    
    var description: String
    
    var usage: String
  }
  object Example {
    
    inline def apply(description: String, usage: String): Example = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Example]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Example] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinimistOptions extends StObject {
    
    var default: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var `--`: js.UndefOr[Boolean] = js.undefined
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    var stopEarly: js.UndefOr[Boolean] = js.undefined
    
    var string: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.undefined
  }
  object MinimistOptions {
    
    inline def apply(): MinimistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimistOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimistOptions] (val x: Self) extends AnyVal {
      
      inline def `set--`(value: Boolean): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      inline def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      inline def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setDefault(value: StringDictionary[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setStopEarly(value: Boolean): Self = StObject.set(x, "stopEarly", value.asInstanceOf[js.Any])
      
      inline def setStopEarlyUndefined: Self = StObject.set(x, "stopEarly", js.undefined)
      
      inline def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setUnknown(value: /* param */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait MriOptions extends StObject {
    
    var default: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var boolean: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var string: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.undefined
  }
  object MriOptions {
    
    inline def apply(): MriOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MriOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MriOptions] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setBoolean(value: String | js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setDefault(value: StringDictionary[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setUnknown(value: /* param */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var description: String
    
    var init: js.UndefOr[OptionInitFunction] = js.undefined
    
    var name: String | (js.Tuple2[String, String])
  }
  object Option {
    
    inline def apply(description: String, name: String | (js.Tuple2[String, String])): Option = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setInit(value: /* value */ Any => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setName(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionInitFunction = js.Function1[/* value */ Any, Any]
  
  type _To = typings.args.mod.args
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.args.mod.args = ^
  
  @js.native
  trait args extends StObject {
    
    def command(name: String, description: String): typings.args.mod.args = js.native
    def command(
      name: String,
      description: String,
      init: js.Function3[
          /* name */ String, 
          /* sub */ js.Array[String], 
          /* options */ ConfigurationOptions, 
          Unit
        ]
    ): typings.args.mod.args = js.native
    def command(
      name: String,
      description: String,
      init: js.Function3[
          /* name */ String, 
          /* sub */ js.Array[String], 
          /* options */ ConfigurationOptions, 
          Unit
        ],
      aliases: js.Array[String]
    ): typings.args.mod.args = js.native
    def command(name: String, description: String, init: Unit, aliases: js.Array[String]): typings.args.mod.args = js.native
    
    def example(usage: String, description: String): typings.args.mod.args = js.native
    
    def examples(list: js.Array[Example]): typings.args.mod.args = js.native
    
    def option(name: String, description: String): typings.args.mod.args = js.native
    def option(name: String, description: String, defaultValue: Any): typings.args.mod.args = js.native
    def option(name: String, description: String, defaultValue: Any, init: OptionInitFunction): typings.args.mod.args = js.native
    def option(name: String, description: String, defaultValue: Unit, init: OptionInitFunction): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String, defaultValue: Any): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String, defaultValue: Any, init: OptionInitFunction): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String, defaultValue: Unit, init: OptionInitFunction): typings.args.mod.args = js.native
    
    def options(list: js.Array[Option]): typings.args.mod.args = js.native
    
    def parse(argv: js.Array[String]): StringDictionary[Any] = js.native
    def parse(argv: js.Array[String], options: ConfigurationOptions): StringDictionary[Any] = js.native
    
    def showHelp(): Unit = js.native
    
    def showVersion(): Unit = js.native
    
    var sub: js.Array[String] = js.native
  }
}
