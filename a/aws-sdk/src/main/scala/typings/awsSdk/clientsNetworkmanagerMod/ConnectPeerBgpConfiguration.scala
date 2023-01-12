package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectPeerBgpConfiguration extends StObject {
  
  /**
    * The address of a core network.
    */
  var CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The ASN of the Coret Network.
    */
  var CoreNetworkAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The address of a core network Connect peer.
    */
  var PeerAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The ASN of the Connect peer.
    */
  var PeerAsn: js.UndefOr[Long] = js.undefined
}
object ConnectPeerBgpConfiguration {
  
  inline def apply(): ConnectPeerBgpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectPeerBgpConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectPeerBgpConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCoreNetworkAddress(value: IPAddress): Self = StObject.set(x, "CoreNetworkAddress", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAddressUndefined: Self = StObject.set(x, "CoreNetworkAddress", js.undefined)
    
    inline def setCoreNetworkAsn(value: Long): Self = StObject.set(x, "CoreNetworkAsn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAsnUndefined: Self = StObject.set(x, "CoreNetworkAsn", js.undefined)
    
    inline def setPeerAddress(value: IPAddress): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    inline def setPeerAsn(value: Long): Self = StObject.set(x, "PeerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "PeerAsn", js.undefined)
  }
}
