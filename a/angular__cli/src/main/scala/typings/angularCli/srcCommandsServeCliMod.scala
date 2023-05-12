package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsServeCliMod {
  
  @JSImport("@angular/cli/src/commands/serve/cli", JSImport.Default)
  @js.native
  open class default () extends ServeCommandModule
  
  @js.native
  trait ServeCommandModule extends ArchitectCommandModule {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_ServeCommandModule: String = js.native
  }
}
