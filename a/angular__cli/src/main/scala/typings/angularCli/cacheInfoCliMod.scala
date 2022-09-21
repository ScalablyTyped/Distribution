package typings.angularCli

import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheInfoCliMod {
  
  @JSImport("@angular/cli/src/commands/cache/info/cli", "CacheInfoCommandModule")
  @js.native
  open class CacheInfoCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_CacheInfoCommandModule: String = js.native
    
    /* private */ var effectiveEnabledStatus: Any = js.native
    
    /* private */ var formatSize: Any = js.native
    
    /* private */ var getSizeOfDirectory: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
