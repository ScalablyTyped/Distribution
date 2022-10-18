package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsCompletionCliMod {
  
  @JSImport("@angular/cli/src/commands/completion/cli", "CompletionCommandModule")
  @js.native
  open class CompletionCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_CompletionCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_CompletionCommandModule: String = js.native
    
    def run(): js.Promise[Double] = js.native
  }
}
