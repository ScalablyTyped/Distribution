package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2TransactionDecisionValue
  extends StObject
     with TransactionDecisionArgument {
  
  /**
    * If `check_result` is NOT `ResultType.OK`, the rest of the fields in
    * this message should be ignored.
    */
  var checkResult: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResult] = js.undefined
  
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when `user_decision`
    * is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * The order that user has approved. This field will be present only when
    * `user_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsV2OrdersOrder] = js.undefined
  
  /**
    * User decision regarding the proposed order.
    */
  var userDecision: js.UndefOr[GoogleActionsV2TransactionDecisionValueUserDecision] = js.undefined
}
object GoogleActionsV2TransactionDecisionValue {
  
  inline def apply(): GoogleActionsV2TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2TransactionDecisionValue] (val x: Self) extends AnyVal {
    
    inline def setCheckResult(value: GoogleActionsV2TransactionRequirementsCheckResult): Self = StObject.set(x, "checkResult", value.asInstanceOf[js.Any])
    
    inline def setCheckResultUndefined: Self = StObject.set(x, "checkResult", js.undefined)
    
    inline def setDeliveryAddress(value: GoogleActionsV2Location): Self = StObject.set(x, "deliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddressUndefined: Self = StObject.set(x, "deliveryAddress", js.undefined)
    
    inline def setOrder(value: GoogleActionsV2OrdersOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setUserDecision(value: GoogleActionsV2TransactionDecisionValueUserDecision): Self = StObject.set(x, "userDecision", value.asInstanceOf[js.Any])
    
    inline def setUserDecisionUndefined: Self = StObject.set(x, "userDecision", js.undefined)
  }
}
