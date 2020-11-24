package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersReceipt extends js.Object {
  
  /**
    * Confirmed order id when order has been received by the integrator. This is
    * the canonical order id used in integrator's system referencing the order
    * and may subsequently be used to identify the order as `action_order_id`.
    *
    * Note that this field is deprecated. Please pass the field through
    * OrderUpdate.action_order_id instead.
    */
  var confirmedActionOrderId: js.UndefOr[String] = js.native
  
  /**
    * Optional. The user facing id referencing to current order, which will show
    * up in the receipt card if present. This should be the id that usually
    * appears on a printed receipt or receipt sent to user's email. User should
    * be able to use this id referencing her order for customer service provided
    * by integrators. Note that this field must be populated if integrator does
    * generate user facing id for an order with a printed receipt / email
    * receipt.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersReceipt {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersReceipt]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersReceiptOps[Self <: GoogleActionsV2OrdersReceipt] (val x: Self) extends AnyVal {
    
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
    def setConfirmedActionOrderId(value: String): Self = this.set("confirmedActionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmedActionOrderId: Self = this.set("confirmedActionOrderId", js.undefined)
    
    @scala.inline
    def setUserVisibleOrderId(value: String): Self = this.set("userVisibleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleOrderId: Self = this.set("userVisibleOrderId", js.undefined)
  }
}
