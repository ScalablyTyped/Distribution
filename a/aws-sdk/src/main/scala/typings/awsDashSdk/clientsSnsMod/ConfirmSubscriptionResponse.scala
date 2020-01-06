package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSubscriptionResponse extends js.Object {
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
}

object ConfirmSubscriptionResponse {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN = null): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (SubscriptionArn != null) __obj.updateDynamic("SubscriptionArn")(SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
}

