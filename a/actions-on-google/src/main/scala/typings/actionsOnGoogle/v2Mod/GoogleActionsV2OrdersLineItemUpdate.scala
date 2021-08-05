package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersLineItemUpdate extends StObject {
  
  /**
    * Update to the line item extension. Type must match the item's
    * existing extension type.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  /**
    * New line item-level state.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.undefined
  
  /**
    * New price for the line item.
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
  
  /**
    * Reason for the change. Required for price changes.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersLineItemUpdate {
  
  inline def apply(): GoogleActionsV2OrdersLineItemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemUpdate]
  }
  
  extension [Self <: GoogleActionsV2OrdersLineItemUpdate](x: Self) {
    
    inline def setExtension(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setOrderState(value: GoogleActionsV2OrdersOrderState): Self = StObject.set(x, "orderState", value.asInstanceOf[js.Any])
    
    inline def setOrderStateUndefined: Self = StObject.set(x, "orderState", js.undefined)
    
    inline def setPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
