package typings.angularCli

import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheCliMod {
  
  @JSImport("@angular/cli/src/commands/cache/cli", "CacheCommandModule")
  @js.native
  open class CacheCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_CacheCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_CacheCommandModule: String = js.native
    
    def run(_options: js.Object): Unit = js.native
  }
}
