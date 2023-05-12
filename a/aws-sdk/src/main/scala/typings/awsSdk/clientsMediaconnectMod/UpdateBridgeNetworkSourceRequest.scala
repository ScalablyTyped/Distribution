package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeNetworkSourceRequest extends StObject {
  
  /**
    * The network source multicast IP.
    */
  var MulticastIp: js.UndefOr[string] = js.undefined
  
  /**
    * The network source's gateway network name.
    */
  var NetworkName: js.UndefOr[string] = js.undefined
  
  /**
    * The network source port.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * The network source protocol.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Protocol] = js.undefined
}
object UpdateBridgeNetworkSourceRequest {
  
  inline def apply(): UpdateBridgeNetworkSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeNetworkSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeNetworkSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setMulticastIp(value: string): Self = StObject.set(x, "MulticastIp", value.asInstanceOf[js.Any])
    
    inline def setMulticastIpUndefined: Self = StObject.set(x, "MulticastIp", js.undefined)
    
    inline def setNetworkName(value: string): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setNetworkNameUndefined: Self = StObject.set(x, "NetworkName", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
