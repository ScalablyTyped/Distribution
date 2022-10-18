package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDeploymentOutput extends StObject {
  
  /**
    * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
    */
  var status: js.UndefOr[StopStatus] = js.undefined
  
  /**
    * An accompanying status message.
    */
  var statusMessage: js.UndefOr[Message] = js.undefined
}
object StopDeploymentOutput {
  
  inline def apply(): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDeploymentOutput]
  }
  
  extension [Self <: StopDeploymentOutput](x: Self) {
    
    inline def setStatus(value: StopStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: Message): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
