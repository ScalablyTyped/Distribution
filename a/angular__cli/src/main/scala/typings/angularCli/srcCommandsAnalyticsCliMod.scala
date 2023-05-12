package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAnalyticsCliMod {
  
  @JSImport("@angular/cli/src/commands/analytics/cli", JSImport.Default)
  @js.native
  open class default () extends AnalyticsCommandModule
  
  @js.native
  trait AnalyticsCommandModule
    extends CommandModule[js.Object] {
    
    @JSName("describe")
    var describe_AnalyticsCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_AnalyticsCommandModule: String = js.native
    
    def run(_options: js.Object): Unit = js.native
  }
}
