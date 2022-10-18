package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsBuildCliMod {
  
  @JSImport("@angular/cli/src/commands/build/cli", "BuildCommandModule")
  @js.native
  open class BuildCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_BuildCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_BuildCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_BuildCommandModule: String = js.native
  }
}
