package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSubscriptionAttributesInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.    RedrivePolicy – When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue. Messages that can't be delivered due to client errors (for example, when the subscribed endpoint is unreachable) or server errors (for example, when the service that powers the subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or reprocessing.  
    */
  var AttributeName: attributeName = js.native
  /**
    * The new value for the attribute in JSON format.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.native
  /**
    * The ARN of the subscription to modify.
    */
  var SubscriptionArn: subscriptionARN = js.native
}

object SetSubscriptionAttributesInput {
  @scala.inline
  def apply(
    AttributeName: attributeName,
    SubscriptionArn: subscriptionARN,
    AttributeValue: attributeValue = null
  ): SetSubscriptionAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubscriptionAttributesInput]
  }
}

