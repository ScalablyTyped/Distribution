package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectPeerResponse extends StObject {
  
  /**
    * Returns information about a core network Connect peer.
    */
  var ConnectPeer: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectPeer] = js.undefined
}
object GetConnectPeerResponse {
  
  inline def apply(): GetConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeer(value: ConnectPeer): Self = StObject.set(x, "ConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerUndefined: Self = StObject.set(x, "ConnectPeer", js.undefined)
  }
}
