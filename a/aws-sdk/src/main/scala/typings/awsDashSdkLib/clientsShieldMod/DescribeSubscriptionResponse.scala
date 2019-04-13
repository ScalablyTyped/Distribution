package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubscriptionResponse extends js.Object {
  /**
    * The AWS Shield Advanced subscription details for an account.
    */
  var Subscription: js.UndefOr[Subscription] = js.undefined
}

object DescribeSubscriptionResponse {
  @scala.inline
  def apply(Subscription: Subscription = null): DescribeSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (Subscription != null) __obj.updateDynamic("Subscription")(Subscription)
    __obj.asInstanceOf[DescribeSubscriptionResponse]
  }
}

