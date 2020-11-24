package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersLineItemUpdate extends js.Object {
  
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
  implicit class GoogleActionsV2OrdersLineItemUpdateOps[Self <: GoogleActionsV2OrdersLineItemUpdate] (val x: Self) extends AnyVal {
    
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
    def setOrderState(value: GoogleActionsV2OrdersOrderState): Self = this.set("orderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderState: Self = this.set("orderState", js.undefined)
    
    @scala.inline
    def setPrice(value: GoogleActionsV2OrdersPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
