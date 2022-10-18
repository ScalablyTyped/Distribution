package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAnalyticsCliMod {
  
  @JSImport("@angular/cli/src/commands/analytics/cli", "AnalyticsCommandModule")
  @js.native
  open class AnalyticsCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_AnalyticsCommandModule: String = js.native
    
    def run(_options: js.Object): Unit = js.native
  }
}
