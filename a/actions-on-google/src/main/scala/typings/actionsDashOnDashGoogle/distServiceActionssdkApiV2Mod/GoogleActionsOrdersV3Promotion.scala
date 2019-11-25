package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Promotion extends js.Object {
  /**
    * Required: Coupon code applied to this offer.
    */
  var coupon: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3Promotion {
  @scala.inline
  def apply(coupon: String = null): GoogleActionsOrdersV3Promotion = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3Promotion]
  }
}

