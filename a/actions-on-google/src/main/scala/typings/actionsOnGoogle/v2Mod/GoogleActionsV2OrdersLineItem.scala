package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersLineItem extends js.Object {
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Extension to the line item based on its type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Unique id of the line item within the Cart/Order. Required.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Small image associated with this item.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Name of the line item as displayed in the receipt. Required.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Optional product or offer id for this item.
    */
  var offerId: js.UndefOr[String] = js.undefined
  /**
    * Each line item should have a price, even if the price is 0. Required.
    * This is the total price as displayed on the receipt for this line
    * (i.e. unit price * quantity).
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
  /**
    * Number of items included.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * Sub-line item(s). Only valid if type is `REGULAR`.
    */
  var subLines: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItemSubLine]] = js.undefined
  /**
    * Type of line item.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersLineItemType] = js.undefined
}

object GoogleActionsV2OrdersLineItem {
  @scala.inline
  def apply(
    description: String = null,
    extension: ApiClientObjectMap[_] = null,
    id: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    name: String = null,
    offerId: String = null,
    price: GoogleActionsV2OrdersPrice = null,
    quantity: Int | Double = null,
    subLines: js.Array[GoogleActionsV2OrdersLineItemSubLine] = null,
    `type`: GoogleActionsV2OrdersLineItemType = null
  ): GoogleActionsV2OrdersLineItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (subLines != null) __obj.updateDynamic("subLines")(subLines.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItem]
  }
}

