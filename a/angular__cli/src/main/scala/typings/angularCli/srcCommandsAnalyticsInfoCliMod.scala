package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAnalyticsInfoCliMod {
  
  @JSImport("@angular/cli/src/commands/analytics/info/cli", "AnalyticsInfoCommandModule")
  @js.native
  open class AnalyticsInfoCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_AnalyticsInfoCommandModule: String = js.native
    
    def run(_options: js.Object): js.Promise[Unit] = js.native
  }
}
