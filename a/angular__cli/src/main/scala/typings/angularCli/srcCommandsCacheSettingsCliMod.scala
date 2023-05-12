package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsCacheSettingsCliMod {
  
  @JSImport("@angular/cli/src/commands/cache/settings/cli", "CacheDisableModule")
  @js.native
  open class CacheDisableModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    var aliases: String = js.native
    
    @JSName("describe")
    var describe_CacheDisableModule: String = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@angular/cli/src/commands/cache/settings/cli", "CacheEnableModule")
  @js.native
  open class CacheEnableModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    var aliases: String = js.native
    
    @JSName("describe")
    var describe_CacheEnableModule: String = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
