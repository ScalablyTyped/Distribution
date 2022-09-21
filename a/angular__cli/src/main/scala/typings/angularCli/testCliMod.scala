package typings.angularCli

import typings.angularCli.architectCommandModuleMod.ArchitectCommandModule
import typings.angularCli.commandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testCliMod {
  
  @JSImport("@angular/cli/src/commands/test/cli", "TestCommandModule")
  @js.native
  open class TestCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_TestCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_TestCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_TestCommandModule: String = js.native
  }
}
