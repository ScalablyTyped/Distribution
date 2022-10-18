package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersLineItem extends StObject {
  
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Extension to the line item based on its type.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
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
  
  inline def apply(): GoogleActionsV2OrdersLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItem]
  }
  
  extension [Self <: GoogleActionsV2OrdersLineItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtension(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSubLines(value: js.Array[GoogleActionsV2OrdersLineItemSubLine]): Self = StObject.set(x, "subLines", value.asInstanceOf[js.Any])
    
    inline def setSubLinesUndefined: Self = StObject.set(x, "subLines", js.undefined)
    
    inline def setSubLinesVarargs(value: GoogleActionsV2OrdersLineItemSubLine*): Self = StObject.set(x, "subLines", js.Array(value*))
    
    inline def setType(value: GoogleActionsV2OrdersLineItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
