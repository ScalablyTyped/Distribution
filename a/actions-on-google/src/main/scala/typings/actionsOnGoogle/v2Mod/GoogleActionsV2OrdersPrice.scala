package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersPrice extends js.Object {
  /**
    * Monetary amount. Required.
    */
  var amount: js.UndefOr[GoogleTypeMoney] = js.native
  /**
    * Type of price. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersPriceType] = js.native
}

object GoogleActionsV2OrdersPrice {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPrice]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPriceOps[Self <: GoogleActionsV2OrdersPrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: GoogleTypeMoney): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setType(value: GoogleActionsV2OrdersPriceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

