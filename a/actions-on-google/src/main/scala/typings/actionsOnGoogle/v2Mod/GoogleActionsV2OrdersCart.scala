package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersCart extends StObject {
  
  /**
    * Extension to the cart based on the type of order.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  /**
    * Optional id for this cart. Included as part of the
    * Cart returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The good(s) or service(s) the user is ordering. There must be at least
    * one line item.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  
  /**
    * Merchant for the cart, if different from the caller.
    */
  var merchant: js.UndefOr[GoogleActionsV2OrdersMerchant] = js.undefined
  
  /**
    * Notes about this cart.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Adjustments entered by the user, e.g. gratuity.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  
  /**
    * Optional. Promotional coupons added to the cart. Eligible promotions will
    * be sent back as discount line items in proposed order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsV2OrdersPromotion]] = js.undefined
}
object GoogleActionsV2OrdersCart {
  
  inline def apply(): GoogleActionsV2OrdersCart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCart]
  }
  
  extension [Self <: GoogleActionsV2OrdersCart](x: Self) {
    
    inline def setExtension(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLineItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    inline def setMerchant(value: GoogleActionsV2OrdersMerchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "otherItems", value.asInstanceOf[js.Any])
    
    inline def setOtherItemsUndefined: Self = StObject.set(x, "otherItems", js.undefined)
    
    inline def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "otherItems", js.Array(value :_*))
    
    inline def setPromotions(value: js.Array[GoogleActionsV2OrdersPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: GoogleActionsV2OrdersPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
  }
}
