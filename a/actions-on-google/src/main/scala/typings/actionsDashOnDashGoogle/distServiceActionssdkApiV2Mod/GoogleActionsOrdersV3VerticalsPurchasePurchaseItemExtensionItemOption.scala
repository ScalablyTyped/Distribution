package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption extends js.Object {
  /**
    * For options that are items, unique item id.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Option name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Note related to the option.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * Option total price.
    */
  var prices: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.undefined
  /**
    * Product or offer id associated with this option.
    */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * For options that are items, quantity.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * To define other nested sub options.
    */
  var subOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    note: String = null,
    prices: js.Array[GoogleActionsOrdersV3PriceAttribute] = null,
    productId: String = null,
    quantity: Int | Double = null,
    subOptions: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption] = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (prices != null) __obj.updateDynamic("prices")(prices.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (subOptions != null) __obj.updateDynamic("subOptions")(subOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]
  }
}

