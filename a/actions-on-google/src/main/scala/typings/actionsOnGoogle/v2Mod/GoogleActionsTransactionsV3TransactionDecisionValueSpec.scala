package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3TransactionDecisionValueSpec extends js.Object {
  
  /**
    * The order that's ready for user to approve.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsTransactionsV3OrderOptions] = js.native
  
  /**
    * Parameters for requesting payment for this order.
    */
  var paymentParameters: js.UndefOr[GoogleActionsTransactionsV3PaymentParameters] = js.native
  
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsTransactionsV3PresentationOptions] = js.native
}
object GoogleActionsTransactionsV3TransactionDecisionValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionDecisionValueSpecOps[Self <: GoogleActionsTransactionsV3TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: GoogleActionsOrdersV3Order): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderOptions(value: GoogleActionsTransactionsV3OrderOptions): Self = this.set("orderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderOptions: Self = this.set("orderOptions", js.undefined)
    
    @scala.inline
    def setPaymentParameters(value: GoogleActionsTransactionsV3PaymentParameters): Self = this.set("paymentParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentParameters: Self = this.set("paymentParameters", js.undefined)
    
    @scala.inline
    def setPresentationOptions(value: GoogleActionsTransactionsV3PresentationOptions): Self = this.set("presentationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentationOptions: Self = this.set("presentationOptions", js.undefined)
  }
}
