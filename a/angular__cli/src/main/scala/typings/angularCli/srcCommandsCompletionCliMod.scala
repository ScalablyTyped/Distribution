package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsCompletionCliMod {
  
  @JSImport("@angular/cli/src/commands/completion/cli", JSImport.Default)
  @js.native
  open class default () extends CompletionCommandModule
  
  @js.native
  trait CompletionCommandModule
    extends CommandModule[js.Object] {
    
    @JSName("describe")
    var describe_CompletionCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_CompletionCommandModule: String = js.native
    
    def run(): js.Promise[Double] = js.native
  }
}
