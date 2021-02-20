package typings.args

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("args", JSImport.Namespace)
  @js.native
  val ^ : typings.args.mod.args = js.native
  
  @js.native
  trait ConfigurationOptions extends StObject {
    
    var help: js.UndefOr[Boolean] = js.native
    
    var mainColor: String | js.Array[String] = js.native
    
    var minimist: js.UndefOr[MinimistOptions] = js.native
    
    var mri: MriOptions = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var subColor: String | js.Array[String] = js.native
    
    var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Boolean] = js.native
  }
  object ConfigurationOptions {
    
    @scala.inline
    def apply(mainColor: String | js.Array[String], mri: MriOptions, subColor: String | js.Array[String]): ConfigurationOptions = {
      val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit class ConfigurationOptionsMutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setMainColor(value: String | js.Array[String]): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainColorVarargs(value: String*): Self = StObject.set(x, "mainColor", js.Array(value :_*))
      
      @scala.inline
      def setMinimist(value: MinimistOptions): Self = StObject.set(x, "minimist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimistUndefined: Self = StObject.set(x, "minimist", js.undefined)
      
      @scala.inline
      def setMri(value: MriOptions): Self = StObject.set(x, "mri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubColor(value: String | js.Array[String]): Self = StObject.set(x, "subColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubColorVarargs(value: String*): Self = StObject.set(x, "subColor", js.Array(value :_*))
      
      @scala.inline
      def setUsageFilter(value: /* output */ js.Any => _): Self = StObject.set(x, "usageFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUsageFilterUndefined: Self = StObject.set(x, "usageFilter", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Example extends StObject {
    
    var description: String = js.native
    
    var usage: String = js.native
  }
  object Example {
    
    @scala.inline
    def apply(description: String, usage: String): Example = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Example]
    }
    
    @scala.inline
    implicit class ExampleMutableBuilder[Self <: Example] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MinimistOptions extends StObject {
    
    var default: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var `--`: js.UndefOr[Boolean] = js.native
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.native
    
    var stopEarly: js.UndefOr[Boolean] = js.native
    
    var string: js.UndefOr[String | js.Array[String]] = js.native
    
    var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.native
  }
  object MinimistOptions {
    
    @scala.inline
    def apply(): MinimistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimistOptions]
    }
    
    @scala.inline
    implicit class MinimistOptionsMutableBuilder[Self <: MinimistOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set--`(value: Boolean): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      @scala.inline
      def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBoolean(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setStopEarly(value: Boolean): Self = StObject.set(x, "stopEarly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopEarlyUndefined: Self = StObject.set(x, "stopEarly", js.undefined)
      
      @scala.inline
      def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: /* param */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait MriOptions extends StObject {
    
    var default: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var boolean: js.UndefOr[String | js.Array[String]] = js.native
    
    var string: js.UndefOr[String | js.Array[String]] = js.native
    
    var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.native
  }
  object MriOptions {
    
    @scala.inline
    def apply(): MriOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MriOptions]
    }
    
    @scala.inline
    implicit class MriOptionsMutableBuilder[Self <: MriOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBoolean(value: String | js.Array[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: StringDictionary[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: /* param */ String => Boolean): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var description: String = js.native
    
    var init: js.UndefOr[OptionInitFunction] = js.native
    
    var name: String | (js.Tuple2[String, String]) = js.native
  }
  object Option {
    
    @scala.inline
    def apply(description: String, name: String | (js.Tuple2[String, String])): Option = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setName(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionInitFunction = js.Function1[/* value */ js.Any, js.Any]
  
  type _To = typings.args.mod.args
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.args.mod.args = ^
  
  @js.native
  trait args extends StObject {
    
    def command(name: String, description: String): typings.args.mod.args = js.native
    def command(name: String, description: String, init: js.UndefOr[scala.Nothing], aliases: js.Array[String]): typings.args.mod.args = js.native
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
    
    def example(usage: String, description: String): typings.args.mod.args = js.native
    
    def examples(list: js.Array[Example]): typings.args.mod.args = js.native
    
    def option(name: String, description: String): typings.args.mod.args = js.native
    def option(
      name: String,
      description: String,
      defaultValue: js.UndefOr[scala.Nothing],
      init: OptionInitFunction
    ): typings.args.mod.args = js.native
    def option(name: String, description: String, defaultValue: js.Any): typings.args.mod.args = js.native
    def option(name: String, description: String, defaultValue: js.Any, init: OptionInitFunction): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String): typings.args.mod.args = js.native
    def option(
      name: js.Tuple2[String, String],
      description: String,
      defaultValue: js.UndefOr[scala.Nothing],
      init: OptionInitFunction
    ): typings.args.mod.args = js.native
    def option(name: js.Tuple2[String, String], description: String, defaultValue: js.Any): typings.args.mod.args = js.native
    def option(
      name: js.Tuple2[String, String],
      description: String,
      defaultValue: js.Any,
      init: OptionInitFunction
    ): typings.args.mod.args = js.native
    
    def options(list: js.Array[Option]): typings.args.mod.args = js.native
    
    def parse(argv: js.Array[String]): StringDictionary[js.Any] = js.native
    def parse(argv: js.Array[String], options: ConfigurationOptions): StringDictionary[js.Any] = js.native
    
    def showHelp(): Unit = js.native
    
    var sub: js.Array[String] = js.native
  }
}
