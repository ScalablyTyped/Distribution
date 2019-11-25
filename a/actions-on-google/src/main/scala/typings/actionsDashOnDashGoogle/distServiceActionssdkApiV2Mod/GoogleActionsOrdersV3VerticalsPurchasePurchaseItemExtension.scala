package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension extends js.Object {
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Fulfillment info for this line item. If unset, this line item
    * inherits order level fulfillment info.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.undefined
  /**
    * Additional add-ons or sub-items.
    */
  var itemOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.undefined
  /**
    * Details about the product.
    */
  var productDetails: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseProductDetails] = js.undefined
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * Quantity of the item.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * Returns info for this line item. If unset, this line item
    * inherits order level returns info.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.undefined
  /**
    * Required: Line item level status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus] = js.undefined
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType] = js.undefined
  /**
    * Unit measure.
    * Specifies the size of the item in chosen units. The size, together with
    * the active price is used to determine the unit price.
    */
  var unitMeasure: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] = js.undefined
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension {
  @scala.inline
  def apply(
    extension: ApiClientObjectMap[_] = null,
    fulfillmentInfo: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo = null,
    itemOptions: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption] = null,
    productDetails: GoogleActionsOrdersV3VerticalsPurchaseProductDetails = null,
    productId: String = null,
    quantity: Int | Double = null,
    returnsInfo: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = null,
    status: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus = null,
    `type`: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType = null,
    unitMeasure: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure = null,
    userVisibleStatusLabel: String = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fulfillmentInfo != null) __obj.updateDynamic("fulfillmentInfo")(fulfillmentInfo.asInstanceOf[js.Any])
    if (itemOptions != null) __obj.updateDynamic("itemOptions")(itemOptions.asInstanceOf[js.Any])
    if (productDetails != null) __obj.updateDynamic("productDetails")(productDetails.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (returnsInfo != null) __obj.updateDynamic("returnsInfo")(returnsInfo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unitMeasure != null) __obj.updateDynamic("unitMeasure")(unitMeasure.asInstanceOf[js.Any])
    if (userVisibleStatusLabel != null) __obj.updateDynamic("userVisibleStatusLabel")(userVisibleStatusLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension]
  }
}

