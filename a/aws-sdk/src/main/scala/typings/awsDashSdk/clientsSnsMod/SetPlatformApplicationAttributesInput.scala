package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPlatformApplicationAttributesInput extends js.Object {
  /**
    * A map of the platform application attributes. Attributes in this map include the following:    PlatformCredential – The credential received from the notification service. For APNS/APNS_SANDBOX, PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret".    PlatformPrincipal – The principal received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id".    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.    SuccessFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    FailureFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    SuccessFeedbackSampleRate – Sample rate percentage (0-100) of successfully delivered messages.  
    */
  var Attributes: MapStringToString
  /**
    * PlatformApplicationArn for SetPlatformApplicationAttributes action.
    */
  var PlatformApplicationArn: String
}

object SetPlatformApplicationAttributesInput {
  @scala.inline
  def apply(Attributes: MapStringToString, PlatformApplicationArn: String): SetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, PlatformApplicationArn = PlatformApplicationArn)
  
    __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
  }
}

