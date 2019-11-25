package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersProposedOrder extends js.Object {
  /**
    * User's items.
    */
  var cart: js.UndefOr[GoogleActionsV2OrdersCart] = js.undefined
  /**
    * Extension to the proposed order based on the kind of order.
    * For example, if the order includes a location then this extension will
    * contain a OrderLocation value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Optional id for this ProposedOrder. Included as part of the
    * ProposedOrder returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Image associated with the proposed order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Fees, adjustments, subtotals, etc.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  /**
    * A link to the terms of service that apply to this proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * Total price of the proposed order. If of type `ACTUAL`, this is the amount
    * the caller will charge when the user confirms the proposed order.
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
}

object GoogleActionsV2OrdersProposedOrder {
  @scala.inline
  def apply(
    cart: GoogleActionsV2OrdersCart = null,
    extension: ApiClientObjectMap[_] = null,
    id: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    otherItems: js.Array[GoogleActionsV2OrdersLineItem] = null,
    termsOfServiceUrl: String = null,
    totalPrice: GoogleActionsV2OrdersPrice = null
  ): GoogleActionsV2OrdersProposedOrder = {
    val __obj = js.Dynamic.literal()
    if (cart != null) __obj.updateDynamic("cart")(cart.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (otherItems != null) __obj.updateDynamic("otherItems")(otherItems.asInstanceOf[js.Any])
    if (termsOfServiceUrl != null) __obj.updateDynamic("termsOfServiceUrl")(termsOfServiceUrl.asInstanceOf[js.Any])
    if (totalPrice != null) __obj.updateDynamic("totalPrice")(totalPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersProposedOrder]
  }
}

