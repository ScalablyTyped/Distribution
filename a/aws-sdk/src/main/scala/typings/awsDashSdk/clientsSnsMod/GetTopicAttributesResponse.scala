package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicAttributesResponse extends js.Object {
  /**
    * A map of the topic's attributes. Attributes in this map include the following:    TopicArn – the topic's ARN    Owner – the AWS account ID of the topic's owner    Policy – the JSON serialization of the topic's access control policy    DisplayName – the human-readable name used in the "From" field for notifications to email and email-json endpoints    SubscriptionsPending – the number of subscriptions pending confirmation on this topic    SubscriptionsConfirmed – the number of confirmed subscriptions on this topic    SubscriptionsDeleted – the number of deleted subscriptions on this topic    DeliveryPolicy – the JSON serialization of the topic's delivery policy    EffectiveDeliveryPolicy – the JSON serialization of the effective delivery policy that takes into account system defaults  
    */
  var Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
}

object GetTopicAttributesResponse {
  @scala.inline
  def apply(Attributes: TopicAttributesMap = null): GetTopicAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[GetTopicAttributesResponse]
  }
}

