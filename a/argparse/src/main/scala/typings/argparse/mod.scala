package typings.argparse

import org.scalablytyped.runtime.StringDictionary
import typings.argparse.anon.Instantiable
import typings.argparse.anon.InstantiableAction
import typings.argparse.anon.Required
import typings.argparse.anon.`0`
import typings.std.Error
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("argparse", "Action")
  @js.native
  abstract class Action protected () extends StObject {
    def this(options: ActionConstructorOptions) = this()
    
    def call(parser: ArgumentParser, namespace: Namespace, values: String): Unit = js.native
    def call(parser: ArgumentParser, namespace: Namespace, values: String, optionString: String): Unit = js.native
    def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String]): Unit = js.native
    def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String], optionString: String): Unit = js.native
    
    /* protected */ var dest: String = js.native
  }
  
  @JSImport("argparse", "ArgumentDefaultsHelpFormatter")
  @js.native
  open class ArgumentDefaultsHelpFormatter () extends StObject
  
  @JSImport("argparse", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends StObject
       with Error {
    def this(argument: Action, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def str(): String = js.native
  }
  
  @JSImport("argparse", "ArgumentGroup")
  @js.native
  open class ArgumentGroup () extends StObject {
    
    def add_argument(arg1: String, arg2: String): Unit = js.native
    def add_argument(arg1: String, arg2: String, options: ArgumentOptions): Unit = js.native
    def add_argument(arg: String): Unit = js.native
    def add_argument(arg: String, options: ArgumentOptions): Unit = js.native
    
    def add_argument_group(): ArgumentGroup = js.native
    def add_argument_group(options: ArgumentGroupOptions): ArgumentGroup = js.native
    
    def add_mutually_exclusive_group(): ArgumentGroup = js.native
    def add_mutually_exclusive_group(options: Required): ArgumentGroup = js.native
    
    def get_default(dest: String): Any = js.native
    
    def set_defaults(): Unit = js.native
    def set_defaults(options: js.Object): Unit = js.native
  }
  
  @JSImport("argparse", "ArgumentParser")
  @js.native
  open class ArgumentParser () extends ArgumentGroup {
    def this(options: ArgumentParserOptions) = this()
    
    def add_subparsers(): SubParser = js.native
    def add_subparsers(options: SubparserOptions): SubParser = js.native
    
    def convert_arg_line_to_args(argLine: String): js.Array[String] = js.native
    
    def error(err: String): Unit = js.native
    def error(err: js.Error): Unit = js.native
    
    def exit(status: Double, message: String): Unit = js.native
    
    def format_help(): String = js.native
    
    def format_usage(): String = js.native
    
    def parse_args(): Any = js.native
    def parse_args(args: js.Array[String]): Any = js.native
    def parse_args(args: js.Array[String], ns: js.Object): Any = js.native
    def parse_args(args: js.Array[String], ns: Namespace): Any = js.native
    def parse_args(args: Unit, ns: js.Object): Any = js.native
    def parse_args(args: Unit, ns: Namespace): Any = js.native
    
    def parse_known_args(): js.Array[Any] = js.native
    def parse_known_args(args: js.Array[String]): js.Array[Any] = js.native
    def parse_known_args(args: js.Array[String], ns: js.Object): js.Array[Any] = js.native
    def parse_known_args(args: js.Array[String], ns: Namespace): js.Array[Any] = js.native
    def parse_known_args(args: Unit, ns: js.Object): js.Array[Any] = js.native
    def parse_known_args(args: Unit, ns: Namespace): js.Array[Any] = js.native
    
    def print_help(): Unit = js.native
    
    def print_usage(): Unit = js.native
  }
  
  @JSImport("argparse", "ArgumentTypeError")
  @js.native
  open class ArgumentTypeError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("argparse", "BooleanOptionalAction")
  @js.native
  open class BooleanOptionalAction protected () extends Action {
    def this(options: ActionConstructorOptions) = this()
  }
  
  @JSImport("argparse", "HelpFormatter")
  @js.native
  open class HelpFormatter () extends StObject
  
  @JSImport("argparse", "Namespace")
  @js.native
  open class Namespace protected ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    def this(options: js.Object) = this()
  }
  
  @JSImport("argparse", "ONE_OR_MORE")
  @js.native
  val ONE_OR_MORE: String = js.native
  
  @JSImport("argparse", "OPTIONAL")
  @js.native
  val OPTIONAL: String = js.native
  
  @JSImport("argparse", "PARSER")
  @js.native
  val PARSER: String = js.native
  
  @JSImport("argparse", "REMAINDER")
  @js.native
  val REMAINDER: String = js.native
  
  @JSImport("argparse", "RawDescriptionHelpFormatter")
  @js.native
  open class RawDescriptionHelpFormatter () extends StObject
  
  @JSImport("argparse", "RawTextHelpFormatter")
  @js.native
  open class RawTextHelpFormatter () extends StObject
  
  @JSImport("argparse", "SUPPRESS")
  @js.native
  val SUPPRESS: String = js.native
  
  @JSImport("argparse", "SubParser")
  @js.native
  open class SubParser () extends StObject {
    
    def add_parser(name: String): ArgumentParser = js.native
    def add_parser(name: String, options: SubArgumentParserOptions): ArgumentParser = js.native
  }
  
  @JSImport("argparse", "ZERO_OR_MORE")
  @js.native
  val ZERO_OR_MORE: String = js.native
  
  @js.native
  trait ActionConstructorOptions
    extends StObject
       with Number {
    
    @JSName("_")
    var _underscore: typings.argparse.argparseStrings.ActionConstructorOptions = js.native
  }
  
  trait ArgumentGroupOptions extends StObject {
    
    var argument_default: js.UndefOr[Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var prefix_chars: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ArgumentGroupOptions {
    
    inline def apply(): ArgumentGroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentGroupOptions]
    }
    
    extension [Self <: ArgumentGroupOptions](x: Self) {
      
      inline def setArgument_default(value: Any): Self = StObject.set(x, "argument_default", value.asInstanceOf[js.Any])
      
      inline def setArgument_defaultUndefined: Self = StObject.set(x, "argument_default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setPrefix_chars(value: String): Self = StObject.set(x, "prefix_chars", value.asInstanceOf[js.Any])
      
      inline def setPrefix_charsUndefined: Self = StObject.set(x, "prefix_chars", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ArgumentOptions extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var action: js.UndefOr[String | InstantiableAction] = js.undefined
    
    // tslint:disable-line:ban-types
    var choices: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var const: js.UndefOr[Any] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
    
    var metavar: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var nargs: js.UndefOr[String | Double] = js.undefined
    
    var option_strings: js.UndefOr[js.Array[String]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    // type may be a string (primitive) or a Function (constructor)
    var `type`: js.UndefOr[String | js.Function] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ArgumentOptions {
    
    inline def apply(): ArgumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentOptions]
    }
    
    extension [Self <: ArgumentOptions](x: Self) {
      
      inline def setAction(value: String | InstantiableAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChoices(value: String | js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setConst(value: Any): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setMetavar(value: String | js.Array[String]): Self = StObject.set(x, "metavar", value.asInstanceOf[js.Any])
      
      inline def setMetavarUndefined: Self = StObject.set(x, "metavar", js.undefined)
      
      inline def setMetavarVarargs(value: String*): Self = StObject.set(x, "metavar", js.Array(value*))
      
      inline def setNargs(value: String | Double): Self = StObject.set(x, "nargs", value.asInstanceOf[js.Any])
      
      inline def setNargsUndefined: Self = StObject.set(x, "nargs", js.undefined)
      
      inline def setOption_strings(value: js.Array[String]): Self = StObject.set(x, "option_strings", value.asInstanceOf[js.Any])
      
      inline def setOption_stringsUndefined: Self = StObject.set(x, "option_strings", js.undefined)
      
      inline def setOption_stringsVarargs(value: String*): Self = StObject.set(x, "option_strings", js.Array(value*))
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String | js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ArgumentParserOptions extends StObject {
    
    var add_help: js.UndefOr[Boolean] = js.undefined
    
    var argument_default: js.UndefOr[Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var epilog: js.UndefOr[String] = js.undefined
    
    var exit_on_error: js.UndefOr[Boolean] = js.undefined
    
    var formatter_class: js.UndefOr[`0`] = js.undefined
    
    var parents: js.UndefOr[js.Array[ArgumentParser]] = js.undefined
    
    var prefix_chars: js.UndefOr[String] = js.undefined
    
    var prog: js.UndefOr[String] = js.undefined
    
    var usage: js.UndefOr[String] = js.undefined
  }
  object ArgumentParserOptions {
    
    inline def apply(): ArgumentParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentParserOptions]
    }
    
    extension [Self <: ArgumentParserOptions](x: Self) {
      
      inline def setAdd_help(value: Boolean): Self = StObject.set(x, "add_help", value.asInstanceOf[js.Any])
      
      inline def setAdd_helpUndefined: Self = StObject.set(x, "add_help", js.undefined)
      
      inline def setArgument_default(value: Any): Self = StObject.set(x, "argument_default", value.asInstanceOf[js.Any])
      
      inline def setArgument_defaultUndefined: Self = StObject.set(x, "argument_default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEpilog(value: String): Self = StObject.set(x, "epilog", value.asInstanceOf[js.Any])
      
      inline def setEpilogUndefined: Self = StObject.set(x, "epilog", js.undefined)
      
      inline def setExit_on_error(value: Boolean): Self = StObject.set(x, "exit_on_error", value.asInstanceOf[js.Any])
      
      inline def setExit_on_errorUndefined: Self = StObject.set(x, "exit_on_error", js.undefined)
      
      inline def setFormatter_class(value: `0`): Self = StObject.set(x, "formatter_class", value.asInstanceOf[js.Any])
      
      inline def setFormatter_classUndefined: Self = StObject.set(x, "formatter_class", js.undefined)
      
      inline def setParents(value: js.Array[ArgumentParser]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setParentsVarargs(value: ArgumentParser*): Self = StObject.set(x, "parents", js.Array(value*))
      
      inline def setPrefix_chars(value: String): Self = StObject.set(x, "prefix_chars", value.asInstanceOf[js.Any])
      
      inline def setPrefix_charsUndefined: Self = StObject.set(x, "prefix_chars", js.undefined)
      
      inline def setProg(value: String): Self = StObject.set(x, "prog", value.asInstanceOf[js.Any])
      
      inline def setProgUndefined: Self = StObject.set(x, "prog", js.undefined)
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  trait SubArgumentParserOptions
    extends StObject
       with ArgumentParserOptions {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
  }
  object SubArgumentParserOptions {
    
    inline def apply(): SubArgumentParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubArgumentParserOptions]
    }
    
    extension [Self <: SubArgumentParserOptions](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
  
  trait SubparserOptions extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
    
    var metavar: js.UndefOr[String] = js.undefined
    
    var parser_class: js.UndefOr[Instantiable] = js.undefined
    
    var prog: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SubparserOptions {
    
    inline def apply(): SubparserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubparserOptions]
    }
    
    extension [Self <: SubparserOptions](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setMetavar(value: String): Self = StObject.set(x, "metavar", value.asInstanceOf[js.Any])
      
      inline def setMetavarUndefined: Self = StObject.set(x, "metavar", js.undefined)
      
      inline def setParser_class(value: Instantiable): Self = StObject.set(x, "parser_class", value.asInstanceOf[js.Any])
      
      inline def setParser_classUndefined: Self = StObject.set(x, "parser_class", js.undefined)
      
      inline def setProg(value: String): Self = StObject.set(x, "prog", value.asInstanceOf[js.Any])
      
      inline def setProgUndefined: Self = StObject.set(x, "prog", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
