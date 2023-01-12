package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlatformApplicationAttributesResponse extends StObject {
  
  /**
    * Attributes include the following:    AppleCertificateExpiryDate – The expiry date of the SSL certificate used to configure certificate-based authentication.    ApplePlatformTeamID – The Apple developer account ID used to configure token-based authentication.    ApplePlatformBundleID – The app identifier used to configure token-based authentication.    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.  
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
}
object GetPlatformApplicationAttributesResponse {
  
  inline def apply(): GetPlatformApplicationAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPlatformApplicationAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
