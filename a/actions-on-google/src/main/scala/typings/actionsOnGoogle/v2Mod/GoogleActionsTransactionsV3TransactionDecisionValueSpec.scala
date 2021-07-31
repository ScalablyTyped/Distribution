package typings.actionsOnGoogle.v2Mod

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
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionDecisionValueSpecMutableBuilder[Self <: GoogleActionsTransactionsV3TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrder(value: GoogleActionsOrdersV3Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderOptions(value: GoogleActionsTransactionsV3OrderOptions): Self = StObject.set(x, "orderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderOptionsUndefined: Self = StObject.set(x, "orderOptions", js.undefined)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPaymentParameters(value: GoogleActionsTransactionsV3PaymentParameters): Self = StObject.set(x, "paymentParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentParametersUndefined: Self = StObject.set(x, "paymentParameters", js.undefined)
    
    @scala.inline
    def setPresentationOptions(value: GoogleActionsTransactionsV3PresentationOptions): Self = StObject.set(x, "presentationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationOptionsUndefined: Self = StObject.set(x, "presentationOptions", js.undefined)
  }
}
