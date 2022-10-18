package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceEndpointRequest extends StObject {
  
  /**
    * The service type for which to get endpoint information about. Can be CUPS for the Configuration and Update Server endpoint, or LNS for the LoRaWAN Network Server endpoint or CLAIM for the global endpoint.
    */
  var ServiceType: js.UndefOr[WirelessGatewayServiceType] = js.undefined
}
object GetServiceEndpointRequest {
  
  inline def apply(): GetServiceEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceEndpointRequest]
  }
  
  extension [Self <: GetServiceEndpointRequest](x: Self) {
    
    inline def setServiceType(value: WirelessGatewayServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
