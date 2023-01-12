package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectPeerRequest extends StObject {
  
  /**
    * The ID of the Connect peer to disassociate from a device.
    */
  var ConnectPeerId: typings.awsSdk.clientsNetworkmanagerMod.ConnectPeerId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
}
object DisassociateConnectPeerRequest {
  
  inline def apply(ConnectPeerId: ConnectPeerId, GlobalNetworkId: GlobalNetworkId): DisassociateConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectPeerId = ConnectPeerId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectPeerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateConnectPeerRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
