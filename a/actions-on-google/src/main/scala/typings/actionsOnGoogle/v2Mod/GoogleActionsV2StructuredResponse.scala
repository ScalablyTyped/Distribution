package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2StructuredResponse extends js.Object {
  /**
    * App provides an order update (e.g.
    * Receipt) after receiving the order.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.native
  /**
    * App provides an order update in API v3 format after receiving the order.
    */
  var orderUpdateV3: js.UndefOr[GoogleActionsOrdersV3OrderUpdate] = js.native
}

object GoogleActionsV2StructuredResponse {
  @scala.inline
  def apply(): GoogleActionsV2StructuredResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2StructuredResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2StructuredResponseOps[Self <: GoogleActionsV2StructuredResponse] (val x: Self) extends AnyVal {
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
    def setOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = this.set("orderUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderUpdate: Self = this.set("orderUpdate", js.undefined)
    @scala.inline
    def setOrderUpdateV3(value: GoogleActionsOrdersV3OrderUpdate): Self = this.set("orderUpdateV3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderUpdateV3: Self = this.set("orderUpdateV3", js.undefined)
  }
  
}

