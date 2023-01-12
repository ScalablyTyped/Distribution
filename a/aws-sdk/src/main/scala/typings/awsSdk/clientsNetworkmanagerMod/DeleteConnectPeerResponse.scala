package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectPeerResponse extends StObject {
  
  /**
    * Information about the deleted Connect peer.
    */
  var ConnectPeer: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ConnectPeer] = js.undefined
}
object DeleteConnectPeerResponse {
  
  inline def apply(): DeleteConnectPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectPeer(value: ConnectPeer): Self = StObject.set(x, "ConnectPeer", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerUndefined: Self = StObject.set(x, "ConnectPeer", js.undefined)
  }
}
