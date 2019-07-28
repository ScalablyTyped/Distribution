package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[endpoint] = js.undefined
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[account] = js.undefined
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[protocol] = js.undefined
  /**
    * The subscription's ARN.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
  /**
    * The ARN of the subscription's topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    Endpoint: endpoint = null,
    Owner: account = null,
    Protocol: protocol = null,
    SubscriptionArn: subscriptionARN = null,
    TopicArn: topicARN = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol)
    if (SubscriptionArn != null) __obj.updateDynamic("SubscriptionArn")(SubscriptionArn)
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[Subscription]
  }
}

