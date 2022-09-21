package typings.angularCli.anon

import typings.angularCli.angularCliBooleans.`false`
import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandScope
import typings.angularCli.commandModuleMod.FullDescribe
import typings.angularCli.commandModuleMod.OtherOptions
import typings.angularCli.configMod.AngularWorkspace
import typings.angularCli.jsonSchemaMod.Option
import typings.angularDevkitCore.apiMod.Analytics
import typings.yargs.mod.ArgumentsCamelCase
import typings.yargs.mod.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@angular/cli.@angular/cli/src/command-builder/command-module.CommandModuleImplementation<{}>> & @angular/cli.@angular/cli/src/command-builder/command-module.CommandModule<{}> */
@js.native
trait PartialCommandModuleImple extends StObject {
  
  /**
    * Adds schema options to a command also this keeps track of options that are required for analytics.
    * **Note:** This method should be called from the command bundler method.
    */
  /* protected */ def addSchemaOptionsToCommand[T](localYargs: Argv[T], options: js.Array[Option]): Argv[T] = js.native
  
  var aliases: js.UndefOr[js.Array[String] | String] = js.native
  
  var builder: js.UndefOr[
    js.Function1[/* argv */ Argv[js.Object], js.Promise[Argv[js.Object]] | Argv[js.Object]]
  ] = js.native
  def builder(argv: Argv[js.Object]): js.Promise[Argv[js.Object]] | Argv[js.Object] = js.native
  
  var command: (js.UndefOr[js.Array[String] | String]) & String = js.native
  
  /* protected */ def commandName: String = js.native
  
  /* protected */ val context: CommandContext = js.native
  
  var deprecated: js.UndefOr[Boolean | String] = js.native
  
  var describe: (js.UndefOr[String | `false`]) & (String | `false`) = js.native
  
  /**
    * Description object which contains the long command descroption.
    * This is used to generate JSON help wich is used in AIO.
    *
    * `false` will result in a hidden command.
    */
  def fullDescribe: FullDescribe | `false` = js.native
  
  /* protected */ def getAnalytics(): js.Promise[Analytics] = js.native
  
  /* protected */ def getWorkspaceOrThrow(): AngularWorkspace = js.native
  
  def handler(args: ArgumentsCamelCase[js.Object] & OtherOptions): js.Promise[Unit] = js.native
  
  var longDescriptionPath: js.UndefOr[String] = js.native
  
  /* private */ val optionsWithAnalytics: Any = js.native
  
  def reportAnalytics(options: js.Object & OtherOptions): js.Promise[Unit] = js.native
  def reportAnalytics(options: js.Object & OtherOptions, paths: js.Array[String]): js.Promise[Unit] = js.native
  def reportAnalytics(
    options: js.Object & OtherOptions,
    paths: js.Array[String],
    dimensions: js.Array[Boolean | Double | String]
  ): js.Promise[Unit] = js.native
  def reportAnalytics(options: js.Object & OtherOptions, paths: Unit, dimensions: js.Array[Boolean | Double | String]): js.Promise[Unit] = js.native
  def reportAnalytics(options: OtherOptions): js.Promise[Unit] = js.native
  def reportAnalytics(options: OtherOptions, paths: js.Array[String]): js.Promise[Unit] = js.native
  def reportAnalytics(options: OtherOptions, paths: js.Array[String], dimensions: js.Array[Boolean | Double | String]): js.Promise[Unit] = js.native
  def reportAnalytics(options: OtherOptions, paths: Unit, dimensions: js.Array[Boolean | Double | String]): js.Promise[Unit] = js.native
  
  var run: js.UndefOr[
    js.Function1[
      /* options */ js.Object & OtherOptions, 
      (js.Promise[Double | Unit]) | Double | Unit
    ]
  ] = js.native
  def run(options: js.Object & OtherOptions): (js.Promise[Double | Unit]) | Double | Unit = js.native
  
  var scope: js.UndefOr[CommandScope] & CommandScope = js.native
  
  /* protected */ val shouldReportAnalytics: Boolean = js.native
}
