package typings.angularCli

import typings.angularCli.angularCliBooleans.`false`
import typings.angularCli.srcAnalyticsAnalyticsCollectorMod.AnalyticsCollector
import typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension
import typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric
import typings.angularCli.srcCommandBuilderUtilitiesJsonSchemaMod.Option
import typings.angularCli.srcUtilitiesConfigMod.AngularWorkspace
import typings.angularCli.srcUtilitiesPackageManagerMod.PackageManagerUtils
import typings.angularDevkitCore.mod.logging.Logger
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderCommandModuleMod {
  
  /* note: abstract class */ @JSImport("@angular/cli/src/command-builder/command-module", "CommandModule")
  @js.native
  open class CommandModule[T /* <: js.Object */] protected ()
    extends StObject
       with CommandModuleImplementation[T] {
    def this(context: CommandContext) = this()
    
    /**
      * Adds schema options to a command also this keeps track of options that are required for analytics.
      * **Note:** This method should be called from the command bundler method.
      */
    /* protected */ def addSchemaOptionsToCommand[T](
      localYargs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any,
      options: js.Array[Option]
    ): Any = js.native
    
    /** Object declaring the options the command accepts, or a function accepting and returning a yargs instance. */
    /* CompleteClass */
    override def builder(
      argv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv */ Any
    ): (js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any
      ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any) = js.native
    
    val command: String = js.native
    
    /* protected */ def commandName: String = js.native
    
    /* protected */ val context: CommandContext = js.native
    
    val describe: String | `false` = js.native
    
    /**
      * Description object which contains the long command descroption.
      * This is used to generate JSON help wich is used in AIO.
      *
      * `false` will result in a hidden command.
      */
    def fullDescribe: FullDescribe | `false` = js.native
    
    /* protected */ def getAnalytics(): js.Promise[js.UndefOr[AnalyticsCollector]] = js.native
    
    /**
      * Flush on an interval (if the event loop is waiting).
      *
      * @returns a method that when called will terminate the periodic
      * flush and call flush one last time.
      */
    /* protected */ def getAnalyticsParameters(options: (Options[T] & OtherOptions) | OtherOptions): Partial[Record[EventCustomDimension | EventCustomMetric, String | Boolean | Double]] = js.native
    
    /* protected */ def getWorkspaceOrThrow(): AngularWorkspace = js.native
    
    def handler(
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgumentsCamelCase<T> */ Any) & OtherOptions
    ): js.Promise[Unit] = js.native
    
    /* private */ val optionsWithAnalytics: Any = js.native
    
    /* private */ var reportCommandRunAnalytics: Any = js.native
    
    /* private */ var reportWorkspaceInfoAnalytics: Any = js.native
    
    /** A function which will be passed the parsed argv. */
    /* CompleteClass */
    override def run(options: Options[T] & OtherOptions): (js.Promise[Double | Unit]) | Double | Unit = js.native
    
    /** Scope in which the command can be executed in. */
    /* CompleteClass */
    var scope: CommandScope = js.native
    
    /* protected */ val shouldReportAnalytics: Boolean = js.native
  }
  
  @JSImport("@angular/cli/src/command-builder/command-module", "CommandModuleError")
  @js.native
  open class CommandModuleError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait CommandScope extends StObject
  @JSImport("@angular/cli/src/command-builder/command-module", "CommandScope")
  @js.native
  object CommandScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandScope & Double] = js.native
    
    /** Command can run inside and outside an Angular workspace. */
    @js.native
    sealed trait Both
      extends StObject
         with CommandScope
    /* 2 */ val Both: typings.angularCli.srcCommandBuilderCommandModuleMod.CommandScope.Both & Double = js.native
    
    /** Command can only run inside an Angular workspace. */
    @js.native
    sealed trait In
      extends StObject
         with CommandScope
    /* 0 */ val In: typings.angularCli.srcCommandBuilderCommandModuleMod.CommandScope.In & Double = js.native
    
    /** Command can only run outside an Angular workspace. */
    @js.native
    sealed trait Out
      extends StObject
         with CommandScope
    /* 1 */ val Out: typings.angularCli.srcCommandBuilderCommandModuleMod.CommandScope.Out & Double = js.native
  }
  
  trait CommandContext extends StObject {
    
    /** Arguments parsed in free-from without parser configuration. */
    var args: typings.angularCli.anon.Options
    
    var currentDirectory: String
    
    var globalConfiguration: AngularWorkspace
    
    var logger: Logger
    
    var packageManager: PackageManagerUtils
    
    var root: String
    
    var workspace: js.UndefOr[AngularWorkspace] = js.undefined
  }
  object CommandContext {
    
    inline def apply(
      args: typings.angularCli.anon.Options,
      currentDirectory: String,
      globalConfiguration: AngularWorkspace,
      logger: Logger,
      packageManager: PackageManagerUtils,
      root: String
    ): CommandContext = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], currentDirectory = currentDirectory.asInstanceOf[js.Any], globalConfiguration = globalConfiguration.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandContext] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: typings.angularCli.anon.Options): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setCurrentDirectory(value: String): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setGlobalConfiguration(value: AngularWorkspace): Self = StObject.set(x, "globalConfiguration", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setPackageManager(value: PackageManagerUtils): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setWorkspace(value: AngularWorkspace): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify YargsCommandModule<{}, T> * / any, 'builder' | 'handler'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify YargsCommandModule<{}, T> * / any[P]} */ trait CommandModuleImplementation[T /* <: js.Object */] extends StObject {
    
    /** Object declaring the options the command accepts, or a function accepting and returning a yargs instance. */
    def builder(
      argv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv */ Any
    ): (js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any
      ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any)
    
    /** Path used to load the long description for the command in JSON help text. */
    var longDescriptionPath: js.UndefOr[String] = js.undefined
    
    /** A function which will be passed the parsed argv. */
    def run(options: Options[T] & OtherOptions): (js.Promise[Double | Unit]) | Double | Unit
    
    /** Scope in which the command can be executed in. */
    var scope: CommandScope
  }
  object CommandModuleImplementation {
    
    inline def apply[T /* <: js.Object */](
      builder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv */ Any => (js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any
        ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any),
      run: Options[T] & OtherOptions => (js.Promise[Double | Unit]) | Double | Unit,
      scope: CommandScope
    ): CommandModuleImplementation[T] = {
      val __obj = js.Dynamic.literal(builder = js.Any.fromFunction1(builder), run = js.Any.fromFunction1(run), scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandModuleImplementation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandModuleImplementation[?], T /* <: js.Object */] (val x: Self & CommandModuleImplementation[T]) extends AnyVal {
      
      inline def setBuilder(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv */ Any => (js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any
            ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any)
      ): Self = StObject.set(x, "builder", js.Any.fromFunction1(value))
      
      inline def setLongDescriptionPath(value: String): Self = StObject.set(x, "longDescriptionPath", value.asInstanceOf[js.Any])
      
      inline def setLongDescriptionPathUndefined: Self = StObject.set(x, "longDescriptionPath", js.undefined)
      
      inline def setRun(value: Options[T] & OtherOptions => (js.Promise[Double | Unit]) | Double | Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setScope(value: CommandScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullDescribe extends StObject {
    
    var describe: js.UndefOr[String] = js.undefined
    
    var longDescription: js.UndefOr[String] = js.undefined
    
    var longDescriptionRelativePath: js.UndefOr[String] = js.undefined
  }
  object FullDescribe {
    
    inline def apply(): FullDescribe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullDescribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullDescribe] (val x: Self) extends AnyVal {
      
      inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
      
      inline def setLongDescriptionRelativePath(value: String): Self = StObject.set(x, "longDescriptionRelativePath", value.asInstanceOf[js.Any])
      
      inline def setLongDescriptionRelativePathUndefined: Self = StObject.set(x, "longDescriptionRelativePath", js.undefined)
      
      inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof T as / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CamelCaseKey<key> * / any ]: T[key]}
    }}}
    */
  @js.native
  trait Options[T] extends StObject
  
  type OtherOptions = Record[String, Any]
}
