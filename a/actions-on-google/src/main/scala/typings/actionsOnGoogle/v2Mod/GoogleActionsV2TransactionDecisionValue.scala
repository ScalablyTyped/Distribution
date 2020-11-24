package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TransactionDecisionValue extends TransactionDecisionArgument {
  
  /**
    * If `check_result` is NOT `ResultType.OK`, the rest of the fields in
    * this message should be ignored.
    */
  var checkResult: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResult] = js.native
  
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when `user_decision`
    * is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * The order that user has approved. This field will be present only when
    * `user_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsV2OrdersOrder] = js.native
  
  /**
    * User decision regarding the proposed order.
    */
  var userDecision: js.UndefOr[GoogleActionsV2TransactionDecisionValueUserDecision] = js.native
}
object GoogleActionsV2TransactionDecisionValue {
  
  @scala.inline
  def apply(): GoogleActionsV2TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValue]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TransactionDecisionValueOps[Self <: GoogleActionsV2TransactionDecisionValue] (val x: Self) extends AnyVal {
    
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
    def setCheckResult(value: GoogleActionsV2TransactionRequirementsCheckResult): Self = this.set("checkResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckResult: Self = this.set("checkResult", js.undefined)
    
    @scala.inline
    def setDeliveryAddress(value: GoogleActionsV2Location): Self = this.set("deliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryAddress: Self = this.set("deliveryAddress", js.undefined)
    
    @scala.inline
    def setOrder(value: GoogleActionsV2OrdersOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setUserDecision(value: GoogleActionsV2TransactionDecisionValueUserDecision): Self = this.set("userDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDecision: Self = this.set("userDecision", js.undefined)
  }
}
