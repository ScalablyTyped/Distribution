package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersProposedOrder extends js.Object {
  /**
    * User's items.
    */
  var cart: js.UndefOr[GoogleActionsV2OrdersCart] = js.native
  /**
    * Extension to the proposed order based on the kind of order.
    * For example, if the order includes a location then this extension will
    * contain a OrderLocation value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Optional id for this ProposedOrder. Included as part of the
    * ProposedOrder returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Image associated with the proposed order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Fees, adjustments, subtotals, etc.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  /**
    * A link to the terms of service that apply to this proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.native
  /**
    * Total price of the proposed order. If of type `ACTUAL`, this is the amount
    * the caller will charge when the user confirms the proposed order.
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
}

object GoogleActionsV2OrdersProposedOrder {
  @scala.inline
  def apply(): GoogleActionsV2OrdersProposedOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersProposedOrder]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersProposedOrderOps[Self <: GoogleActionsV2OrdersProposedOrder] (val x: Self) extends AnyVal {
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
    def setCart(value: GoogleActionsV2OrdersCart): Self = this.set("cart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCart: Self = this.set("cart", js.undefined)
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = this.set("otherItems", js.Array(value :_*))
    @scala.inline
    def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = this.set("otherItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherItems: Self = this.set("otherItems", js.undefined)
    @scala.inline
    def setTermsOfServiceUrl(value: String): Self = this.set("termsOfServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsOfServiceUrl: Self = this.set("termsOfServiceUrl", js.undefined)
    @scala.inline
    def setTotalPrice(value: GoogleActionsV2OrdersPrice): Self = this.set("totalPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPrice: Self = this.set("totalPrice", js.undefined)
  }
  
}

