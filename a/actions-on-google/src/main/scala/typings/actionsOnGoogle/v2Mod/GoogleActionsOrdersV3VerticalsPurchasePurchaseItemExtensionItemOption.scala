package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption extends StObject {
  
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
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPrices(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    inline def setPricesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = StObject.set(x, "prices", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSubOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = StObject.set(x, "subOptions", value.asInstanceOf[js.Any])
    
    inline def setSubOptionsUndefined: Self = StObject.set(x, "subOptions", js.undefined)
    
    inline def setSubOptionsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption*): Self = StObject.set(x, "subOptions", js.Array(value*))
  }
}
