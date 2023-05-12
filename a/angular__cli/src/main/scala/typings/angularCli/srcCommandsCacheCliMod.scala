package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsCacheCliMod {
  
  @JSImport("@angular/cli/src/commands/cache/cli", JSImport.Default)
  @js.native
  open class default () extends CacheCommandModule
  
  @js.native
  trait CacheCommandModule
    extends CommandModule[js.Object] {
    
    @JSName("describe")
    var describe_CacheCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_CacheCommandModule: String = js.native
    
    def run(_options: js.Object): Unit = js.native
  }
}
