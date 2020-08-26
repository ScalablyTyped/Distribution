package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseProductDetails extends js.Object {
  /**
    * Global Trade Item Number of the product.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * Price look-up codes, commonly called PLU codes, PLU numbers, PLUs,
    * produce codes, or produce labels, are a system of numbers that
    * uniquely identify bulk produce sold in grocery stores and supermarkets.
    */
  var plu: js.UndefOr[String] = js.native
  /**
    * Merchant-provided details about the product,
    * e.g. { \"allergen\": \"peanut\" }.
    * Useful if offerId is not present in Merchant Center. Optional.
    */
  var productAttributes: js.UndefOr[ApiClientObjectMap[String]] = js.native
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Product category defined by the merchant.
    * E.g. \"Home > Grocery > Dairy & Eggs > Milk > Whole Milk\"
    */
  var productType: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchaseProductDetails {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchaseProductDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseProductDetails]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchaseProductDetailsOps[Self <: GoogleActionsOrdersV3VerticalsPurchaseProductDetails] (val x: Self) extends AnyVal {
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
    def setGtin(value: String): Self = this.set("gtin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGtin: Self = this.set("gtin", js.undefined)
    @scala.inline
    def setPlu(value: String): Self = this.set("plu", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlu: Self = this.set("plu", js.undefined)
    @scala.inline
    def setProductAttributes(value: ApiClientObjectMap[String]): Self = this.set("productAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductAttributes: Self = this.set("productAttributes", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductType(value: String): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("productType", js.undefined)
  }
  
}

