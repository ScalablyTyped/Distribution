package typings.angularCli

import typings.angularCli.angularCliBooleans.`false`
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsMakeThisAwesomeCliMod {
  
  @JSImport("@angular/cli/src/commands/make-this-awesome/cli", JSImport.Default)
  @js.native
  open class default () extends AwesomeCommandModule
  
  @js.native
  trait AwesomeCommandModule
    extends CommandModule[js.Object] {
    
    var deprecated: Boolean = js.native
    
    @JSName("describe")
    var describe_AwesomeCommandModule: `false` = js.native
    
    def run(): Unit = js.native
  }
}
