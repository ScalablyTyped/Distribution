package typings.angularCli

import typings.angularCli.anon.Instantiable
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModuleImplementation
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderUtilitiesCommandMod {
  
  @JSImport("@angular/cli/src/command-builder/utilities/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCommandModuleToYargs[T /* <: js.Object */, U /* <: CommandModuleConstructor */](
    localYargs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv<T> */ Any,
    commandModule: U,
    context: CommandContext
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommandModuleToYargs")(localYargs.asInstanceOf[js.Any], commandModule.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@angular/cli/src/command-builder/utilities/command", "demandCommandFailureMessage")
  @js.native
  val demandCommandFailureMessage: /* "You need to specify a command before moving on. Use '--help' to view the available commands." */ String = js.native
  
  type CommandModuleConstructor = Partial[CommandModuleImplementation[js.Object]] & Instantiable
}
