package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3TransactionDecisionValueSpec extends StObject {
  
  /**
    * The order that's ready for user to approve.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsTransactionsV3OrderOptions] = js.undefined
  
  /**
    * Parameters for requesting payment for this order.
    */
  var paymentParameters: js.UndefOr[GoogleActionsTransactionsV3PaymentParameters] = js.undefined
  
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsTransactionsV3PresentationOptions] = js.undefined
}
object GoogleActionsTransactionsV3TransactionDecisionValueSpec {
  
  inline def apply(): GoogleActionsTransactionsV3TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValueSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: GoogleActionsOrdersV3Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderOptions(value: GoogleActionsTransactionsV3OrderOptions): Self = StObject.set(x, "orderOptions", value.asInstanceOf[js.Any])
    
    inline def setOrderOptionsUndefined: Self = StObject.set(x, "orderOptions", js.undefined)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPaymentParameters(value: GoogleActionsTransactionsV3PaymentParameters): Self = StObject.set(x, "paymentParameters", value.asInstanceOf[js.Any])
    
    inline def setPaymentParametersUndefined: Self = StObject.set(x, "paymentParameters", js.undefined)
    
    inline def setPresentationOptions(value: GoogleActionsTransactionsV3PresentationOptions): Self = StObject.set(x, "presentationOptions", value.asInstanceOf[js.Any])
    
    inline def setPresentationOptionsUndefined: Self = StObject.set(x, "presentationOptions", js.undefined)
  }
}
