package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersProposedOrder extends StObject {
  
  /**
    * User's items.
    */
  var cart: js.UndefOr[GoogleActionsV2OrdersCart] = js.native
  
  /**
    * Extension to the proposed order based on the kind of order.
    * For example, if the order includes a location then this extension will
    * contain a OrderLocation value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Optional id for this ProposedOrder. Included as part of the
    * ProposedOrder returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Image associated with the proposed order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Fees, adjustments, subtotals, etc.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  
  /**
    * A link to the terms of service that apply to this proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * Total price of the proposed order. If of type `ACTUAL`, this is the amount
    * the caller will charge when the user confirms the proposed order.
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
}
object GoogleActionsV2OrdersProposedOrder {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersProposedOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersProposedOrder]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersProposedOrderMutableBuilder[Self <: GoogleActionsV2OrdersProposedOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCart(value: GoogleActionsV2OrdersCart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCartUndefined: Self = StObject.set(x, "cart", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "otherItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherItemsUndefined: Self = StObject.set(x, "otherItems", js.undefined)
    
    @scala.inline
    def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "otherItems", js.Array(value :_*))
    
    @scala.inline
    def setTermsOfServiceUrl(value: String): Self = StObject.set(x, "termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceUrlUndefined: Self = StObject.set(x, "termsOfServiceUrl", js.undefined)
    
    @scala.inline
    def setTotalPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPriceUndefined: Self = StObject.set(x, "totalPrice", js.undefined)
  }
}
