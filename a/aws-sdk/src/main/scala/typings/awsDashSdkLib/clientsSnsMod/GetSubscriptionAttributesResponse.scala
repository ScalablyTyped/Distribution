package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptionAttributesResponse extends js.Object {
  /**
    * A map of the subscription's attributes. Attributes in this map include the following:    ConfirmationWasAuthenticated – true if the subscription confirmation request was authenticated.    DeliveryPolicy – The JSON serialization of the subscription's delivery policy.    EffectiveDeliveryPolicy – The JSON serialization of the effective delivery policy that takes into account the topic delivery policy and account system defaults.    FilterPolicy – The filter policy JSON that is assigned to the subscription.    Owner – The AWS account ID of the subscription's owner.    PendingConfirmation – true if the subscription hasn't been confirmed. To confirm a pending subscription, call the ConfirmSubscription action with a confirmation token.    RawMessageDelivery – true if raw message delivery is enabled for the subscription. Raw messages are free of JSON formatting and can be sent to HTTP/S and Amazon SQS endpoints.    SubscriptionArn – The subscription's ARN.    TopicArn – The topic ARN that the subscription is associated with.  
    */
  var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
}

object GetSubscriptionAttributesResponse {
  @scala.inline
  def apply(Attributes: SubscriptionAttributesMap = null): GetSubscriptionAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[GetSubscriptionAttributesResponse]
  }
}

