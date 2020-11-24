package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3MerchantPaymentMethod extends js.Object {
  
  /**
    * Required. Display info of this payment method.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.native
  
  /**
    * Optional. The group / profile name that the payment method belongs to.
    */
  var paymentMethodGroup: js.UndefOr[String] = js.native
  
  /**
    * Required. Id of the payment method passed from merchant / action.
    * Note this id is should be unique if multiple payment methods are sent from
    * Merchant/Action.
    */
  var paymentMethodId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Status of the payment method.
    * If not present, the payment method is assumed to be in OK status.
    */
  var paymentMethodStatus: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatus] = js.native
}
object GoogleActionsTransactionsV3MerchantPaymentMethod {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3MerchantPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentMethod]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3MerchantPaymentMethodOps[Self <: GoogleActionsTransactionsV3MerchantPaymentMethod] (val x: Self) extends AnyVal {
    
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
    def setPaymentMethodDisplayInfo(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfo): Self = this.set("paymentMethodDisplayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodDisplayInfo: Self = this.set("paymentMethodDisplayInfo", js.undefined)
    
    @scala.inline
    def setPaymentMethodGroup(value: String): Self = this.set("paymentMethodGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodGroup: Self = this.set("paymentMethodGroup", js.undefined)
    
    @scala.inline
    def setPaymentMethodId(value: String): Self = this.set("paymentMethodId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodId: Self = this.set("paymentMethodId", js.undefined)
    
    @scala.inline
    def setPaymentMethodStatus(value: GoogleActionsTransactionsV3PaymentMethodStatus): Self = this.set("paymentMethodStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodStatus: Self = this.set("paymentMethodStatus", js.undefined)
  }
}
