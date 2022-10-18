package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension extends StObject {
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
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
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension](x: Self) {
    
    inline def setExtension(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    inline def setItemOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = StObject.set(x, "itemOptions", value.asInstanceOf[js.Any])
    
    inline def setItemOptionsUndefined: Self = StObject.set(x, "itemOptions", js.undefined)
    
    inline def setItemOptionsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption*): Self = StObject.set(x, "itemOptions", js.Array(value*))
    
    inline def setProductDetails(value: GoogleActionsOrdersV3VerticalsPurchaseProductDetails): Self = StObject.set(x, "productDetails", value.asInstanceOf[js.Any])
    
    inline def setProductDetailsUndefined: Self = StObject.set(x, "productDetails", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = StObject.set(x, "returnsInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnsInfoUndefined: Self = StObject.set(x, "returnsInfo", js.undefined)
    
    inline def setStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnitMeasure(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure): Self = StObject.set(x, "unitMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitMeasureUndefined: Self = StObject.set(x, "unitMeasure", js.undefined)
    
    inline def setUserVisibleStatusLabel(value: String): Self = StObject.set(x, "userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleStatusLabelUndefined: Self = StObject.set(x, "userVisibleStatusLabel", js.undefined)
  }
}
