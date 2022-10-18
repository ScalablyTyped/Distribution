package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCommandResult extends StObject {
  
  /**
    * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
    */
  var Command: js.UndefOr[typings.awsSdk.clientsSsmMod.Command] = js.undefined
}
object SendCommandResult {
  
  inline def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  
  extension [Self <: SendCommandResult](x: Self) {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
  }
}
