package typings.angularCli

import typings.angularCli.angularCliBooleans.`false`
import typings.angularCli.anon.OptionsAnalyticsCommandAr
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandScope
import typings.angularCli.srcCommandBuilderCommandModuleMod.FullDescribe
import typings.angularCli.srcCommandBuilderCommandModuleMod.OtherOptions
import typings.angularCli.srcCommandBuilderUtilitiesJsonSchemaMod.Option
import typings.angularCli.srcUtilitiesConfigMod.AngularWorkspace
import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.yargs.mod.ArgumentsCamelCase
import typings.yargs.mod.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAnalyticsSettingsCliMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModuleImplementation because var conflicts: aliases, command, deprecated, describe, longDescriptionPath, scope. Inlined  */ @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsDisableModule")
  @js.native
  open class AnalyticsDisableModule ()
    extends StObject
       with AnalyticsSettingModule {
    
    @JSName("aliases")
    var aliases_AnalyticsDisableModule: String = js.native
    
    @JSName("command")
    var command_AnalyticsDisableModule: String = js.native
    
    @JSName("describe")
    var describe_AnalyticsDisableModule: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModuleImplementation because var conflicts: aliases, command, deprecated, describe, longDescriptionPath, scope. Inlined  */ @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsEnableModule")
  @js.native
  open class AnalyticsEnableModule ()
    extends StObject
       with AnalyticsSettingModule {
    
    @JSName("aliases")
    var aliases_AnalyticsEnableModule: String = js.native
    
    @JSName("command")
    var command_AnalyticsEnableModule: String = js.native
    
    @JSName("describe")
    var describe_AnalyticsEnableModule: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModuleImplementation because var conflicts: aliases, command, deprecated, describe, longDescriptionPath, scope. Inlined  */ @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsPromptModule")
  @js.native
  open class AnalyticsPromptModule ()
    extends StObject
       with AnalyticsSettingModule {
    
    @JSName("command")
    var command_AnalyticsPromptModule: String = js.native
    
    @JSName("describe")
    var describe_AnalyticsPromptModule: String = js.native
  }
  
  trait AnalyticsCommandArgs extends StObject {
    
    var global: Boolean
  }
  object AnalyticsCommandArgs {
    
    inline def apply(global: Boolean): AnalyticsCommandArgs = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsCommandArgs]
    }
    
    extension [Self <: AnalyticsCommandArgs](x: Self) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @angular/cli.@angular/cli/src/command-builder/command-module.CommandModule<@angular/cli.@angular/cli/src/commands/analytics/settings/cli.AnalyticsCommandArgs> */
  /* Inlined parent @angular/cli.@angular/cli/src/command-builder/command-module.CommandModuleImplementation<@angular/cli.@angular/cli/src/commands/analytics/settings/cli.AnalyticsCommandArgs> */
  @js.native
  trait AnalyticsSettingModule extends StObject {
    
    /**
      * Adds schema options to a command also this keeps track of options that are required for analytics.
      * **Note:** This method should be called from the command bundler method.
      */
    /* protected */ def addSchemaOptionsToCommand[T](localYargs: Argv[T], options: js.Array[Option]): Argv[T] = js.native
    
    var aliases: js.UndefOr[js.Array[String] | String] = js.native
    
    def builder(argv: Argv[js.Object]): js.Promise[Argv[AnalyticsCommandArgs]] | Argv[AnalyticsCommandArgs] = js.native
    @JSName("builder")
    def builder_Argv(localYargs: Argv[js.Object]): Argv[AnalyticsCommandArgs] = js.native
    
    val command: String & (js.UndefOr[js.Array[String] | String]) = js.native
    
    /* protected */ def commandName: String = js.native
    
    /* protected */ val context: CommandContext = js.native
    
    var deprecated: js.UndefOr[Boolean | String] = js.native
    
    val describe: (String | `false`) & (js.UndefOr[String | `false`]) = js.native
    
    /**
      * Description object which contains the long command descroption.
      * This is used to generate JSON help wich is used in AIO.
      *
      * `false` will result in a hidden command.
      */
    def fullDescribe: FullDescribe | `false` = js.native
    
    /* protected */ def getAnalytics(): js.Promise[Analytics] = js.native
    
    /* protected */ def getWorkspaceOrThrow(): AngularWorkspace = js.native
    
    def handler(args: ArgumentsCamelCase[AnalyticsCommandArgs] & OtherOptions): js.Promise[Unit] = js.native
    
    var longDescriptionPath: js.UndefOr[String] = js.native
    
    /* private */ val optionsWithAnalytics: Any = js.native
    
    def reportAnalytics(options: (OptionsAnalyticsCommandAr & OtherOptions) | OtherOptions): js.Promise[Unit] = js.native
    def reportAnalytics(options: (OptionsAnalyticsCommandAr & OtherOptions) | OtherOptions, paths: js.Array[String]): js.Promise[Unit] = js.native
    def reportAnalytics(
      options: (OptionsAnalyticsCommandAr & OtherOptions) | OtherOptions,
      paths: js.Array[String],
      dimensions: js.Array[Boolean | Double | String]
    ): js.Promise[Unit] = js.native
    def reportAnalytics(
      options: (OptionsAnalyticsCommandAr & OtherOptions) | OtherOptions,
      paths: Unit,
      dimensions: js.Array[Boolean | Double | String]
    ): js.Promise[Unit] = js.native
    
    def run(hasGlobal: OptionsAnalyticsCommandAr): js.Promise[Unit] = js.native
    def run(options: OptionsAnalyticsCommandAr & OtherOptions): (js.Promise[Double | Unit]) | Double | Unit = js.native
    
    /** Scope in which the command can be executed in. */
    val scope: CommandScope = js.native
    
    /* protected */ val shouldReportAnalytics: Boolean = js.native
  }
}
