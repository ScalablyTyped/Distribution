package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptionAttributesInput extends js.Object {
  /**
    * The ARN of the subscription whose properties you want to get.
    */
  var SubscriptionArn: subscriptionARN
}

object GetSubscriptionAttributesInput {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): GetSubscriptionAttributesInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn)
  
    __obj.asInstanceOf[GetSubscriptionAttributesInput]
  }
}

