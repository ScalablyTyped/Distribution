package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo extends js.Object {
  /**
    * Return is allowed within that many days.
    */
  var daysToReturn: js.UndefOr[Double] = js.undefined
  /**
    * If true, return is allowed.
    */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  /**
    * Link to the return policy.
    */
  var policyUrl: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo {
  @scala.inline
  def apply(
    daysToReturn: Int | Double = null,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    policyUrl: String = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = {
    val __obj = js.Dynamic.literal()
    if (daysToReturn != null) __obj.updateDynamic("daysToReturn")(daysToReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable.asInstanceOf[js.Any])
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo]
  }
}

