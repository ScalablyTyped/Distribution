package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPlatformApplicationAttributesInput extends StObject {
  
  /**
    * A map of the platform application attributes. Attributes in this map include the following:    PlatformCredential – The credential received from the notification service.   For ADM, PlatformCredentialis client secret.   For Apple Services using certificate credentials, PlatformCredential is private key.   For Apple Services using token credentials, PlatformCredential is signing key.   For GCM (Firebase Cloud Messaging), PlatformCredential is API key.         PlatformPrincipal – The principal received from the notification service.   For ADM, PlatformPrincipalis client id.   For Apple Services using certificate credentials, PlatformPrincipal is SSL certificate.   For Apple Services using token credentials, PlatformPrincipal is signing key ID.   For GCM (Firebase Cloud Messaging), there is no PlatformPrincipal.         EventEndpointCreated – Topic ARN to which EndpointCreated event notifications are sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications are sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications are sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications are sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.    SuccessFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    FailureFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    SuccessFeedbackSampleRate – Sample rate percentage (0-100) of successfully delivered messages.   The following attributes only apply to APNs token-based authentication:    ApplePlatformTeamID – The identifier that's assigned to your Apple developer account team.    ApplePlatformBundleID – The bundle identifier that's assigned to your iOS app.  
    */
  var Attributes: MapStringToString
  
  /**
    * PlatformApplicationArn for SetPlatformApplicationAttributes action.
    */
  var PlatformApplicationArn: String
}
object SetPlatformApplicationAttributesInput {
  
  inline def apply(Attributes: MapStringToString, PlatformApplicationArn: String): SetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
  }
  
  extension [Self <: SetPlatformApplicationAttributesInput](x: Self) {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
