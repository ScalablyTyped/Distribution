package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsE2eCliMod {
  
  @JSImport("@angular/cli/src/commands/e2e/cli", JSImport.Default)
  @js.native
  open class default () extends E2eCommandModule
  
  @js.native
  trait E2eCommandModule extends ArchitectCommandModule {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_E2eCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_E2eCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
