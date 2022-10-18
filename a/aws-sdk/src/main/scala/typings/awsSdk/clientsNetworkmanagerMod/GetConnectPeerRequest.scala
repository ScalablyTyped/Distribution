package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectPeerRequest extends StObject {
  
  /**
    * The ID of the Connect peer.
    */
  var ConnectPeerId: typings.awsSdk.clientsNetworkmanagerMod.ConnectPeerId
}
object GetConnectPeerRequest {
  
  inline def apply(ConnectPeerId: ConnectPeerId): GetConnectPeerRequest = {
    val __obj = js.Dynamic.literal(ConnectPeerId = ConnectPeerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectPeerRequest]
  }
  
  extension [Self <: GetConnectPeerRequest](x: Self) {
    
    inline def setConnectPeerId(value: ConnectPeerId): Self = StObject.set(x, "ConnectPeerId", value.asInstanceOf[js.Any])
  }
}
