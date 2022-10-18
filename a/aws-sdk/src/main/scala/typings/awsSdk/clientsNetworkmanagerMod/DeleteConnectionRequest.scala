package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var ConnectionId: typings.awsSdk.clientsNetworkmanagerMod.ConnectionId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
}
object DeleteConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId, GlobalNetworkId: GlobalNetworkId): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
  
  extension [Self <: DeleteConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
