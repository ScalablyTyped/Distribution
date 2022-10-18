package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceEndpointResponse extends StObject {
  
  /**
    * The Root CA of the server trust certificate.
    */
  var ServerTrust: js.UndefOr[CertificatePEM] = js.undefined
  
  /**
    * The service endpoint value.
    */
  var ServiceEndpoint: js.UndefOr[EndPoint] = js.undefined
  
  /**
    * The endpoint's service type.
    */
  var ServiceType: js.UndefOr[WirelessGatewayServiceType] = js.undefined
}
object GetServiceEndpointResponse {
  
  inline def apply(): GetServiceEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceEndpointResponse]
  }
  
  extension [Self <: GetServiceEndpointResponse](x: Self) {
    
    inline def setServerTrust(value: CertificatePEM): Self = StObject.set(x, "ServerTrust", value.asInstanceOf[js.Any])
    
    inline def setServerTrustUndefined: Self = StObject.set(x, "ServerTrust", js.undefined)
    
    inline def setServiceEndpoint(value: EndPoint): Self = StObject.set(x, "ServiceEndpoint", value.asInstanceOf[js.Any])
    
    inline def setServiceEndpointUndefined: Self = StObject.set(x, "ServiceEndpoint", js.undefined)
    
    inline def setServiceType(value: WirelessGatewayServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
