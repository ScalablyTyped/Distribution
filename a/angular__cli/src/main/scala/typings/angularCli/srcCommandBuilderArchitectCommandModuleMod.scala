package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.ArchitectBaseCommandModule
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderArchitectCommandModuleMod {
  
  /* note: abstract class */ @JSImport("@angular/cli/src/command-builder/architect-command-module", "ArchitectCommandModule")
  @js.native
  open class ArchitectCommandModule protected () extends ArchitectBaseCommandModule[ArchitectCommandArgs] {
    def this(context: CommandContext) = this()
    
    /* private */ var getArchitectProject: Any = js.native
    
    /** @returns a sorted list of configuration names to be used for auto completion. */
    /* private */ var getConfigurationChoices: Any = js.native
    
    /** @returns a sorted list of project names to be used for auto completion. */
    /* private */ var getProjectChoices: Any = js.native
    
    /* private */ var getProjectNamesByTarget: Any = js.native
    
    val multiTarget: Boolean = js.native
  }
  
  trait ArchitectCommandArgs extends StObject {
    
    var configuration: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
  }
  object ArchitectCommandArgs {
    
    inline def apply(): ArchitectCommandArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchitectCommandArgs]
    }
    
    extension [Self <: ArchitectCommandArgs](x: Self) {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
}
