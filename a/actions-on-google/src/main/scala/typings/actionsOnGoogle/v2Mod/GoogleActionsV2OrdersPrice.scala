package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPrice extends js.Object {
  /**
    * Monetary amount. Required.
    */
  var amount: js.UndefOr[GoogleTypeMoney] = js.undefined
  /**
    * Type of price. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersPriceType] = js.undefined
}

object GoogleActionsV2OrdersPrice {
  @scala.inline
  def apply(amount: GoogleTypeMoney = null, `type`: GoogleActionsV2OrdersPriceType = null): GoogleActionsV2OrdersPrice = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersPrice]
  }
}

