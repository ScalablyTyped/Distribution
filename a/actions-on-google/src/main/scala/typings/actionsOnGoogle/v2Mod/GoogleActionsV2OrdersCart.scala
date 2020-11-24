package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersCart extends js.Object {
  
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
  implicit class GoogleActionsV2OrdersCartOps[Self <: GoogleActionsV2OrdersCart] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setMerchant(value: GoogleActionsV2OrdersMerchant): Self = this.set("merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchant: Self = this.set("merchant", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = this.set("otherItems", js.Array(value :_*))
    
    @scala.inline
    def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = this.set("otherItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherItems: Self = this.set("otherItems", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: GoogleActionsV2OrdersPromotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[GoogleActionsV2OrdersPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
  }
}
