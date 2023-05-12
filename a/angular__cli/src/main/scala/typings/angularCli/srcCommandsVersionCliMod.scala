package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsVersionCliMod {
  
  @JSImport("@angular/cli/src/commands/version/cli", JSImport.Default)
  @js.native
  open class default () extends VersionCommandModule
  
  @js.native
  trait VersionCommandModule
    extends CommandModule[js.Object] {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_VersionCommandModule: String = js.native
    
    /* private */ var getVersion: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
