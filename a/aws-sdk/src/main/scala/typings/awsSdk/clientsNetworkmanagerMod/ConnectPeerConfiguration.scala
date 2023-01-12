package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectPeerConfiguration extends StObject {
  
  /**
    * The Connect peer BGP configurations.
    */
  var BgpConfigurations: js.UndefOr[ConnectPeerBgpConfigurationList] = js.undefined
  
  /**
    * The IP address of a core network.
    */
  var CoreNetworkAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The inside IP addresses used for a Connect peer configuration.
    */
  var InsideCidrBlocks: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The IP address of the Connect peer.
    */
  var PeerAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The protocol used for a Connect peer configuration.
    */
  var Protocol: js.UndefOr[TunnelProtocol] = js.undefined
}
object ConnectPeerConfiguration {
  
  inline def apply(): ConnectPeerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectPeerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectPeerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBgpConfigurations(value: ConnectPeerBgpConfigurationList): Self = StObject.set(x, "BgpConfigurations", value.asInstanceOf[js.Any])
    
    inline def setBgpConfigurationsUndefined: Self = StObject.set(x, "BgpConfigurations", js.undefined)
    
    inline def setBgpConfigurationsVarargs(value: ConnectPeerBgpConfiguration*): Self = StObject.set(x, "BgpConfigurations", js.Array(value*))
    
    inline def setCoreNetworkAddress(value: IPAddress): Self = StObject.set(x, "CoreNetworkAddress", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkAddressUndefined: Self = StObject.set(x, "CoreNetworkAddress", js.undefined)
    
    inline def setInsideCidrBlocks(value: ConstrainedStringList): Self = StObject.set(x, "InsideCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setInsideCidrBlocksUndefined: Self = StObject.set(x, "InsideCidrBlocks", js.undefined)
    
    inline def setInsideCidrBlocksVarargs(value: ConstrainedString*): Self = StObject.set(x, "InsideCidrBlocks", js.Array(value*))
    
    inline def setPeerAddress(value: IPAddress): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    inline def setProtocol(value: TunnelProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
