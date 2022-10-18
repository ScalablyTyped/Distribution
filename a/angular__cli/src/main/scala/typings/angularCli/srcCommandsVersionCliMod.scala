package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsVersionCliMod {
  
  @JSImport("@angular/cli/src/commands/version/cli", "VersionCommandModule")
  @js.native
  open class VersionCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_VersionCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_VersionCommandModule: String = js.native
    
    /* private */ var getVersion: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
