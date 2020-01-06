package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeInput extends js.Object {
  /**
    * The ARN of the subscription to be deleted.
    */
  var SubscriptionArn: subscriptionARN = js.native
}

object UnsubscribeInput {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): UnsubscribeInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeInput]
  }
}

