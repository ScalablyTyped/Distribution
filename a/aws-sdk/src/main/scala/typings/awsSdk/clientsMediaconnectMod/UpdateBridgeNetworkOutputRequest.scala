package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeNetworkOutputRequest extends StObject {
  
  /**
    * The network output IP Address.
    */
  var IpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The network output's gateway network name.
    */
  var NetworkName: js.UndefOr[string] = js.undefined
  
  /**
    * The network output port.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * The network output protocol.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Protocol] = js.undefined
  
  /**
    * The network output TTL.
    */
  var Ttl: js.UndefOr[integer] = js.undefined
}
object UpdateBridgeNetworkOutputRequest {
  
  inline def apply(): UpdateBridgeNetworkOutputRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeNetworkOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeNetworkOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: string): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setNetworkName(value: string): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setNetworkNameUndefined: Self = StObject.set(x, "NetworkName", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setTtl(value: integer): Self = StObject.set(x, "Ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "Ttl", js.undefined)
  }
}
