package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseProductDetails extends StObject {
  
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
  implicit class GoogleActionsOrdersV3VerticalsPurchaseProductDetailsMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchaseProductDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setPlu(value: String): Self = StObject.set(x, "plu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluUndefined: Self = StObject.set(x, "plu", js.undefined)
    
    @scala.inline
    def setProductAttributes(value: ApiClientObjectMap[String]): Self = StObject.set(x, "productAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAttributesUndefined: Self = StObject.set(x, "productAttributes", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
  }
}
