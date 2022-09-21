package typings.angularCli

import typings.angularCli.architectBaseCommandModuleMod.MissingTargetChoice
import typings.angularCli.architectCommandModuleMod.ArchitectCommandModule
import typings.angularCli.commandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lintCliMod {
  
  @JSImport("@angular/cli/src/commands/lint/cli", "LintCommandModule")
  @js.native
  open class LintCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_LintCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_LintCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_LintCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
