package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrder extends js.Object {
  
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    */
  var actionOrderId: js.UndefOr[String] = js.native
  
  /**
    * If requested, customer info e.g. email will be passed back to the app.
    */
  var customerInfo: js.UndefOr[GoogleActionsV2OrdersCustomerInfo] = js.native
  
  /**
    * Reflect back the proposed order that caused the order.
    */
  var finalOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.native
  
  /**
    * Order id assigned by Google.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  
  /**
    * Date and time the order was created.
    */
  var orderDate: js.UndefOr[String] = js.native
  
  /**
    * Payment related info for the order.
    */
  var paymentInfo: js.UndefOr[GoogleActionsV2OrdersPaymentInfo] = js.native
}
object GoogleActionsV2OrdersOrder {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrder]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderOps[Self <: GoogleActionsV2OrdersOrder] (val x: Self) extends AnyVal {
    
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
    def setActionOrderId(value: String): Self = this.set("actionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionOrderId: Self = this.set("actionOrderId", js.undefined)
    
    @scala.inline
    def setCustomerInfo(value: GoogleActionsV2OrdersCustomerInfo): Self = this.set("customerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerInfo: Self = this.set("customerInfo", js.undefined)
    
    @scala.inline
    def setFinalOrder(value: GoogleActionsV2OrdersProposedOrder): Self = this.set("finalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalOrder: Self = this.set("finalOrder", js.undefined)
    
    @scala.inline
    def setGoogleOrderId(value: String): Self = this.set("googleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleOrderId: Self = this.set("googleOrderId", js.undefined)
    
    @scala.inline
    def setOrderDate(value: String): Self = this.set("orderDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderDate: Self = this.set("orderDate", js.undefined)
    
    @scala.inline
    def setPaymentInfo(value: GoogleActionsV2OrdersPaymentInfo): Self = this.set("paymentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentInfo: Self = this.set("paymentInfo", js.undefined)
  }
}
