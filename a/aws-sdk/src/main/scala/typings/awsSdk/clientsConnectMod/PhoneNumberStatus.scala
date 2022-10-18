package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberStatus extends StObject {
  
  /**
    * The status message.
    */
  var Message: js.UndefOr[PhoneNumberWorkflowMessage] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[PhoneNumberWorkflowStatus] = js.undefined
}
object PhoneNumberStatus {
  
  inline def apply(): PhoneNumberStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberStatus]
  }
  
  extension [Self <: PhoneNumberStatus](x: Self) {
    
    inline def setMessage(value: PhoneNumberWorkflowMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: PhoneNumberWorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
