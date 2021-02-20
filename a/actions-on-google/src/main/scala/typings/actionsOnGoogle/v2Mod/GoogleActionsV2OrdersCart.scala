package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersCart extends StObject {
  
  /**
    * Extension to the cart based on the type of order.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Optional id for this cart. Included as part of the
    * Cart returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The good(s) or service(s) the user is ordering. There must be at least
    * one line item.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  
  /**
    * Merchant for the cart, if different from the caller.
    */
  var merchant: js.UndefOr[GoogleActionsV2OrdersMerchant] = js.native
  
  /**
    * Notes about this cart.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Adjustments entered by the user, e.g. gratuity.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  
  /**
    * Optional. Promotional coupons added to the cart. Eligible promotions will
    * be sent back as discount line items in proposed order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsV2OrdersPromotion]] = js.native
}
object GoogleActionsV2OrdersCart {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersCart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCart]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersCartMutableBuilder[Self <: GoogleActionsV2OrdersCart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setMerchant(value: GoogleActionsV2OrdersMerchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "otherItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherItemsUndefined: Self = StObject.set(x, "otherItems", js.undefined)
    
    @scala.inline
    def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "otherItems", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[GoogleActionsV2OrdersPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: GoogleActionsV2OrdersPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
  }
}
