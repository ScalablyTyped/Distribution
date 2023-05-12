package typings.angularCli

import typings.angularCli.anon.OptionsRunCommandArgs
import typings.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.ArchitectBaseCommandModule
import typings.angularDevkitArchitect.srcApiMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsRunCliMod {
  
  @JSImport("@angular/cli/src/commands/run/cli", JSImport.Default)
  @js.native
  open class default () extends RunCommandModule
  
  trait RunCommandArgs extends StObject {
    
    var target: String
  }
  object RunCommandArgs {
    
    inline def apply(target: String): RunCommandArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunCommandModule extends ArchitectBaseCommandModule[RunCommandArgs] {
    
    @JSName("describe")
    var describe_RunCommandModule: String = js.native
    
    /** @returns a sorted list of target specifiers to be used for auto completion. */
    /* private */ var getTargetChoices: Any = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_RunCommandModule: String = js.native
    
    /* protected */ def makeTargetSpecifier(): js.UndefOr[Target] = js.native
    /* protected */ def makeTargetSpecifier(options: OptionsRunCommandArgs): js.UndefOr[Target] = js.native
  }
}
