package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInboundConnectionRequest extends StObject {
  
  /**
    * The unique identifier of the inbound connection to reject.
    */
  var ConnectionId: typings.awsSdk.clientsOpensearchMod.ConnectionId
}
object RejectInboundConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): RejectInboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInboundConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectInboundConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
