package typings.angularCli

import typings.angularCli.angularCliNumbers.`1`
import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import typings.angularCli.commandModuleMod.OtherOptions
import typings.angularCli.jsonSchemaMod.Option
import typings.angularDevkitArchitect.apiMod.Target
import typings.angularDevkitArchitect.mod.Architect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object architectBaseCommandModuleMod {
  
  @JSImport("@angular/cli/src/command-builder/architect-base-command-module", "ArchitectBaseCommandModule")
  @js.native
  abstract class ArchitectBaseCommandModule[T /* <: js.Object */] protected () extends CommandModule[T] {
    def this(context: CommandContext) = this()
    
    /* private */ var _architect: Any = js.native
    
    /* private */ var _architectHost: Any = js.native
    
    /* protected */ def getArchitect(): Architect = js.native
    
    /* protected */ def getArchitectHost(): Any = js.native
    
    /* protected */ def getArchitectTarget(): String = js.native
    
    /* protected */ def getArchitectTargetOptions(target: Target): js.Promise[js.Array[Option]] = js.native
    
    /* private */ var getMissingTargetPackageToInstall: Any = js.native
    
    /* protected */ val missingTargetChoices: js.UndefOr[js.Array[MissingTargetChoice]] = js.native
    
    /* protected */ def onMissingTarget(defaultMessage: String): js.Promise[`1`] = js.native
    
    /* protected */ def runSingleTarget(target: Target, options: OtherOptions): js.Promise[Double] = js.native
    
    /* private */ var warnOnMissingNodeModules: Any = js.native
  }
  
  trait MissingTargetChoice extends StObject {
    
    var name: String
    
    var value: String
  }
  object MissingTargetChoice {
    
    inline def apply(name: String, value: String): MissingTargetChoice = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingTargetChoice]
    }
    
    extension [Self <: MissingTargetChoice](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
