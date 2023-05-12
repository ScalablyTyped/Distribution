package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessEndpointEniOptions extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInterfaceId] = js.undefined
  
  /**
    * The IP port number.
    */
  var Port: js.UndefOr[VerifiedAccessEndpointPortNumber] = js.undefined
  
  /**
    * The IP protocol.
    */
  var Protocol: js.UndefOr[VerifiedAccessEndpointProtocol] = js.undefined
}
object CreateVerifiedAccessEndpointEniOptions {
  
  inline def apply(): CreateVerifiedAccessEndpointEniOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessEndpointEniOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessEndpointEniOptions] (val x: Self) extends AnyVal {
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPort(value: VerifiedAccessEndpointPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: VerifiedAccessEndpointProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
