package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersProposedOrder extends StObject {
  
  /**
    * User's items.
    */
  var cart: js.UndefOr[GoogleActionsV2OrdersCart] = js.undefined
  
  /**
    * Extension to the proposed order based on the kind of order.
    * For example, if the order includes a location then this extension will
    * contain a OrderLocation value.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  /**
    * Optional id for this ProposedOrder. Included as part of the
    * ProposedOrder returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Image associated with the proposed order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * Fees, adjustments, subtotals, etc.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.undefined
  
  /**
    * A link to the terms of service that apply to this proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Total price of the proposed order. If of type `ACTUAL`, this is the amount
    * the caller will charge when the user confirms the proposed order.
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
}
object GoogleActionsV2OrdersProposedOrder {
  
  inline def apply(): GoogleActionsV2OrdersProposedOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersProposedOrder]
  }
  
  extension [Self <: GoogleActionsV2OrdersProposedOrder](x: Self) {
    
    inline def setCart(value: GoogleActionsV2OrdersCart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
    
    inline def setCartUndefined: Self = StObject.set(x, "cart", js.undefined)
    
    inline def setExtension(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = StObject.set(x, "otherItems", value.asInstanceOf[js.Any])
    
    inline def setOtherItemsUndefined: Self = StObject.set(x, "otherItems", js.undefined)
    
    inline def setOtherItemsVarargs(value: GoogleActionsV2OrdersLineItem*): Self = StObject.set(x, "otherItems", js.Array(value*))
    
    inline def setTermsOfServiceUrl(value: String): Self = StObject.set(x, "termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceUrlUndefined: Self = StObject.set(x, "termsOfServiceUrl", js.undefined)
    
    inline def setTotalPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalPriceUndefined: Self = StObject.set(x, "totalPrice", js.undefined)
  }
}
