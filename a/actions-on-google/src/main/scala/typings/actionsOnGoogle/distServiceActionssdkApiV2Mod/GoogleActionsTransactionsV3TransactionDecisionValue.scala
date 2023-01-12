package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3TransactionDecisionValue
  extends StObject
     with TransactionDecisionArgument {
  
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when
    * `transaction_decision` is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * The order that user has approved. This field will be present only when
    * `transaction_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  
  /**
    * Decision regarding the order.
    */
  var transactionDecision: js.UndefOr[GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision] = js.undefined
}
object GoogleActionsTransactionsV3TransactionDecisionValue {
  
  inline def apply(): GoogleActionsTransactionsV3TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3TransactionDecisionValue] (val x: Self) extends AnyVal {
    
    inline def setDeliveryAddress(value: GoogleActionsV2Location): Self = StObject.set(x, "deliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddressUndefined: Self = StObject.set(x, "deliveryAddress", js.undefined)
    
    inline def setOrder(value: GoogleActionsOrdersV3Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setTransactionDecision(value: GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision): Self = StObject.set(x, "transactionDecision", value.asInstanceOf[js.Any])
    
    inline def setTransactionDecisionUndefined: Self = StObject.set(x, "transactionDecision", js.undefined)
  }
}
