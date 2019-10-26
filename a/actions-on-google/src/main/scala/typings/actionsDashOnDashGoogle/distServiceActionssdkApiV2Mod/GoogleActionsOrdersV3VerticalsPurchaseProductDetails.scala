package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchaseProductDetails extends js.Object {
  /**
    * Global Trade Item Number of the product.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var gtin: js.UndefOr[String] = js.undefined
  /**
    * Price look-up codes, commonly called PLU codes, PLU numbers, PLUs,
    * produce codes, or produce labels, are a system of numbers that
    * uniquely identify bulk produce sold in grocery stores and supermarkets.
    */
  var plu: js.UndefOr[String] = js.undefined
  /**
    * Merchant-provided details about the product,
    * e.g. { \"allergen\": \"peanut\" }.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var productAttributes: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * Product category defined by the merchant.
    * E.g. \"Home > Grocery > Dairy & Eggs > Milk > Whole Milk\"
    */
  var productType: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchaseProductDetails {
  @scala.inline
  def apply(
    gtin: String = null,
    plu: String = null,
    productAttributes: ApiClientObjectMap[String] = null,
    productId: String = null,
    productType: String = null
  ): GoogleActionsOrdersV3VerticalsPurchaseProductDetails = {
    val __obj = js.Dynamic.literal()
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (plu != null) __obj.updateDynamic("plu")(plu)
    if (productAttributes != null) __obj.updateDynamic("productAttributes")(productAttributes)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productType != null) __obj.updateDynamic("productType")(productType)
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseProductDetails]
  }
}

