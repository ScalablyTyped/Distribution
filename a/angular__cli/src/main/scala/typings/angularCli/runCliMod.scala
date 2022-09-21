package typings.angularCli

import typings.angularCli.anon.OptionsRunCommandArgs
import typings.angularCli.architectBaseCommandModuleMod.ArchitectBaseCommandModule
import typings.angularCli.commandModuleMod.CommandContext
import typings.angularDevkitArchitect.apiMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runCliMod {
  
  @JSImport("@angular/cli/src/commands/run/cli", "RunCommandModule")
  @js.native
  open class RunCommandModule protected () extends ArchitectBaseCommandModule[RunCommandArgs] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_RunCommandModule: String = js.native
    
    /** @returns a sorted list of target specifiers to be used for auto completion. */
    /* private */ var getTargetChoices: Any = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_RunCommandModule: String = js.native
    
    /* protected */ def makeTargetSpecifier(): js.UndefOr[Target] = js.native
    /* protected */ def makeTargetSpecifier(options: OptionsRunCommandArgs): js.UndefOr[Target] = js.native
  }
  
  trait RunCommandArgs extends StObject {
    
    var target: String
  }
  object RunCommandArgs {
    
    inline def apply(target: String): RunCommandArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunCommandArgs]
    }
    
    extension [Self <: RunCommandArgs](x: Self) {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
