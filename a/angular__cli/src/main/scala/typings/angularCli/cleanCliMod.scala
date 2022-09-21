package typings.angularCli

import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanCliMod {
  
  @JSImport("@angular/cli/src/commands/cache/clean/cli", "CacheCleanModule")
  @js.native
  open class CacheCleanModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_CacheCleanModule: String = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
