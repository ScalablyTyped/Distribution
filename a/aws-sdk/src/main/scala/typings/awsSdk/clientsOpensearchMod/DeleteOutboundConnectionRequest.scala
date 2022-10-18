package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutboundConnectionRequest extends StObject {
  
  /**
    * The ID of the outbound connection you want to permanently delete.
    */
  var ConnectionId: typings.awsSdk.clientsOpensearchMod.ConnectionId
}
object DeleteOutboundConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): DeleteOutboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutboundConnectionRequest]
  }
  
  extension [Self <: DeleteOutboundConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
