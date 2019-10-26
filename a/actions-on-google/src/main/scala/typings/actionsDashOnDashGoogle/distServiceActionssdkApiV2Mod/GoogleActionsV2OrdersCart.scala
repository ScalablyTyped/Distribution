package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersCart extends js.Object {
  /**
    * Extension to the cart based on the type of order.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Optional id for this cart. Included as part of the
    * Cart returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The good(s) or service(s) the user is ordering. There must be at least
    * one line item.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  /**
    * Merchant for the cart, if different from the caller.
    */
  var merchant: js.UndefOr[GoogleActionsV2OrdersMerchant] = js.undefined
  /**
    * Notes about this cart.
    */
  var notes: js.UndefOr[String] = js.undefined
  /**
    * Adjustments entered by the user, e.g. gratuity.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  /**
    * Optional. Promotional coupons added to the cart. Eligible promotions will
    * be sent back as discount line items in proposed order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsV2OrdersPromotion]] = js.undefined
}

object GoogleActionsV2OrdersCart {
  @scala.inline
  def apply(
    extension: ApiClientObjectMap[_] = null,
    id: String = null,
    lineItems: js.Array[GoogleActionsV2OrdersLineItem] = null,
    merchant: GoogleActionsV2OrdersMerchant = null,
    notes: String = null,
    otherItems: js.Array[GoogleActionsV2OrdersLineItem] = null,
    promotions: js.Array[GoogleActionsV2OrdersPromotion] = null
  ): GoogleActionsV2OrdersCart = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (merchant != null) __obj.updateDynamic("merchant")(merchant)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (otherItems != null) __obj.updateDynamic("otherItems")(otherItems)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    __obj.asInstanceOf[GoogleActionsV2OrdersCart]
  }
}

