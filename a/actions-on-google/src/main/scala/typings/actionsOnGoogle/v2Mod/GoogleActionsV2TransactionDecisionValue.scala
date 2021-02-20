package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import org.scalablytyped.runtime.StObject
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
  implicit class GoogleActionsV2TransactionDecisionValueMutableBuilder[Self <: GoogleActionsV2TransactionDecisionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckResult(value: GoogleActionsV2TransactionRequirementsCheckResult): Self = StObject.set(x, "checkResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckResultUndefined: Self = StObject.set(x, "checkResult", js.undefined)
    
    @scala.inline
    def setDeliveryAddress(value: GoogleActionsV2Location): Self = StObject.set(x, "deliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryAddressUndefined: Self = StObject.set(x, "deliveryAddress", js.undefined)
    
    @scala.inline
    def setOrder(value: GoogleActionsV2OrdersOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setUserDecision(value: GoogleActionsV2TransactionDecisionValueUserDecision): Self = StObject.set(x, "userDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDecisionUndefined: Self = StObject.set(x, "userDecision", js.undefined)
  }
}
