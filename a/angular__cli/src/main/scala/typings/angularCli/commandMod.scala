package typings.angularCli

import typings.angularCli.anon.PartialCommandModuleImpleInstantiable
import typings.angularCli.commandModuleMod.CommandContext
import typings.yargs.mod.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("@angular/cli/src/command-builder/utilities/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCommandModuleToYargs[T /* <: js.Object */, U /* <: PartialCommandModuleImpleInstantiable */](localYargs: Argv[T], commandModule: U, context: CommandContext): Argv[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommandModuleToYargs")(localYargs.asInstanceOf[js.Any], commandModule.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Argv[T]]
  
  @JSImport("@angular/cli/src/command-builder/utilities/command", "demandCommandFailureMessage")
  @js.native
  val demandCommandFailureMessage: /* "You need to specify a command before moving on. Use '--help' to view the available commands." */ String = js.native
}
