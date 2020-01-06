package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscriptionResponse extends js.Object {
  /**
    * The AWS Shield Advanced subscription details for an account.
    */
  var Subscription: js.UndefOr[typings.awsDashSdk.clientsShieldMod.Subscription] = js.native
}

object DescribeSubscriptionResponse {
  @scala.inline
  def apply(Subscription: Subscription = null): DescribeSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (Subscription != null) __obj.updateDynamic("Subscription")(Subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscriptionResponse]
  }
}

