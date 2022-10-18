package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInboundConnectionRequest extends StObject {
  
  /**
    * The ID of the inbound connection to reject.
    */
  var ConnectionId: typings.awsSdk.clientsOpensearchMod.ConnectionId
}
object RejectInboundConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): RejectInboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInboundConnectionRequest]
  }
  
  extension [Self <: RejectInboundConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
