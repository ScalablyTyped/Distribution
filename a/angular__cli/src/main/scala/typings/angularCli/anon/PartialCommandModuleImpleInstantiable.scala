package typings.angularCli.anon

import org.scalablytyped.runtime.Instantiable1
import typings.angularCli.angularCliBooleans.`false`
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandScope
import typings.angularCli.srcCommandBuilderCommandModuleMod.OtherOptions
import typings.yargs.mod.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@angular/cli.@angular/cli/src/command-builder/command-module.CommandModuleImplementation<{}>> & {new (context : @angular/cli.@angular/cli/src/command-builder/command-module.CommandContext): std.Partial<@angular/cli.@angular/cli/src/command-builder/command-module.CommandModuleImplementation<{}>> & @angular/cli.@angular/cli/src/command-builder/command-module.CommandModule<{}>} */
@js.native
trait PartialCommandModuleImpleInstantiable
  extends StObject
     with Instantiable1[/* context */ CommandContext, PartialCommandModuleImple] {
  
  var aliases: js.UndefOr[js.Array[String] | String] = js.native
  
  var builder: js.UndefOr[
    js.Function1[/* argv */ Argv[js.Object], js.Promise[Argv[js.Object]] | Argv[js.Object]]
  ] = js.native
  
  var command: js.UndefOr[js.Array[String] | String] = js.native
  
  var deprecated: js.UndefOr[Boolean | String] = js.native
  
  var describe: js.UndefOr[String | `false`] = js.native
  
  var longDescriptionPath: js.UndefOr[String] = js.native
  
  var run: js.UndefOr[
    js.Function1[
      /* options */ js.Object & OtherOptions, 
      (js.Promise[Double | Unit]) | Double | Unit
    ]
  ] = js.native
  
  var scope: js.UndefOr[CommandScope] = js.native
}
