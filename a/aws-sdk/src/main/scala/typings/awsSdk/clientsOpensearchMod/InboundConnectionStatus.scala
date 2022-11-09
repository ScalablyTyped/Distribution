package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundConnectionStatus extends StObject {
  
  /**
    * Information about the connection.
    */
  var Message: js.UndefOr[ConnectionStatusMessage] = js.undefined
  
  /**
    * The status code for the connection. Can be one of the following:    PENDING_ACCEPTANCE - Inbound connection is not yet accepted by the remote domain owner.    APPROVED: Inbound connection is pending acceptance by the remote domain owner.    PROVISIONING: Inbound connection is being provisioned.    ACTIVE: Inbound connection is active and ready to use.    REJECTING: Inbound connection rejection is in process.    REJECTED: Inbound connection is rejected.    DELETING: Inbound connection deletion is in progress.    DELETED: Inbound connection is deleted and can no longer be used.  
    */
  var StatusCode: js.UndefOr[InboundConnectionStatusCode] = js.undefined
}
object InboundConnectionStatus {
  
  inline def apply(): InboundConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundConnectionStatus]
  }
  
  extension [Self <: InboundConnectionStatus](x: Self) {
    
    inline def setMessage(value: ConnectionStatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatusCode(value: InboundConnectionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
