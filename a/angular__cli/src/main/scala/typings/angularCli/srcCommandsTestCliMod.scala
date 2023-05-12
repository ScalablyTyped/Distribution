package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsTestCliMod {
  
  @JSImport("@angular/cli/src/commands/test/cli", JSImport.Default)
  @js.native
  open class default () extends TestCommandModule
  
  @js.native
  trait TestCommandModule extends ArchitectCommandModule {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_TestCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_TestCommandModule: String = js.native
  }
}
