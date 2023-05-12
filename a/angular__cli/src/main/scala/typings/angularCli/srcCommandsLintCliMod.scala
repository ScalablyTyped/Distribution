package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsLintCliMod {
  
  @JSImport("@angular/cli/src/commands/lint/cli", JSImport.Default)
  @js.native
  open class default () extends LintCommandModule
  
  @js.native
  trait LintCommandModule extends ArchitectCommandModule {
    
    @JSName("describe")
    var describe_LintCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_LintCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_LintCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
