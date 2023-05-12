package typings.angularCli

import typings.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsBuildCliMod {
  
  @JSImport("@angular/cli/src/commands/build/cli", JSImport.Default)
  @js.native
  open class default () extends BuildCommandModule
  
  @js.native
  trait BuildCommandModule extends ArchitectCommandModule {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_BuildCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_BuildCommandModule: String = js.native
  }
}
