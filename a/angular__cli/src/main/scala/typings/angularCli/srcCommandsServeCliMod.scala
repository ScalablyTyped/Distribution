package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsServeCliMod {
  
  @JSImport("@angular/cli/src/commands/serve/cli", "ServeCommandModule")
  @js.native
  open class ServeCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_ServeCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_ServeCommandModule: String = js.native
  }
}
