package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsDeployCliMod {
  
  @JSImport("@angular/cli/src/commands/deploy/cli", JSImport.Default)
  @js.native
  open class default () extends DeployCommandModule
  
  @js.native
  trait DeployCommandModule extends ArchitectCommandModule {
    
    @JSName("describe")
    var describe_DeployCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_DeployCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_DeployCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
