package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersLineItemUpdate extends StObject {
  
  /**
    * Update to the line item extension. Type must match the item's
    * existing extension type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * New line item-level state.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.native
  
  /**
    * New price for the line item.
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  
  /**
    * Reason for the change. Required for price changes.
    */
  var reason: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersLineItemUpdate {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemUpdate]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemUpdateMutableBuilder[Self <: GoogleActionsV2OrdersLineItemUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setOrderState(value: GoogleActionsV2OrdersOrderState): Self = StObject.set(x, "orderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderStateUndefined: Self = StObject.set(x, "orderState", js.undefined)
    
    @scala.inline
    def setPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
