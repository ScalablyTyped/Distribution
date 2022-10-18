package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundConnectionRequest extends StObject {
  
  /**
    * The ID of the inbound connection to permanently delete.
    */
  var ConnectionId: typings.awsSdk.clientsOpensearchMod.ConnectionId
}
object DeleteInboundConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): DeleteInboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundConnectionRequest]
  }
  
  extension [Self <: DeleteInboundConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
