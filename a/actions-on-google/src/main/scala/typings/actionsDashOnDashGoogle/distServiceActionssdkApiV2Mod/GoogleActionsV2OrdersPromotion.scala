package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPromotion extends js.Object {
  /**
    * Required. Coupon code understood by 3P. For ex: GOOGLE10.
    */
  var coupon: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersPromotion {
  @scala.inline
  def apply(coupon: String = null): GoogleActionsV2OrdersPromotion = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersPromotion]
  }
}

