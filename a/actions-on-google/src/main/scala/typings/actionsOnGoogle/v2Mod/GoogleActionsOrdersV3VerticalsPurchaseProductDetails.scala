package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchaseProductDetails extends StObject {
  
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
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchaseProductDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseProductDetails]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchaseProductDetails](x: Self) {
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setPlu(value: String): Self = StObject.set(x, "plu", value.asInstanceOf[js.Any])
    
    inline def setPluUndefined: Self = StObject.set(x, "plu", js.undefined)
    
    inline def setProductAttributes(value: ApiClientObjectMap[String]): Self = StObject.set(x, "productAttributes", value.asInstanceOf[js.Any])
    
    inline def setProductAttributesUndefined: Self = StObject.set(x, "productAttributes", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
  }
}
