package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionRequest extends StObject {
  
  /**
    * The ID of the link for the second device in the connection.
    */
  var ConnectedLinkId: js.UndefOr[LinkId] = js.undefined
  
  /**
    * The ID of the connection.
    */
  var ConnectionId: typings.awsSdk.clientsNetworkmanagerMod.ConnectionId
  
  /**
    * A description of the connection. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link for the first device in the connection.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
}
object UpdateConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId, GlobalNetworkId: GlobalNetworkId): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectedLinkId(value: LinkId): Self = StObject.set(x, "ConnectedLinkId", value.asInstanceOf[js.Any])
    
    inline def setConnectedLinkIdUndefined: Self = StObject.set(x, "ConnectedLinkId", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
