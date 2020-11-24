package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentResult extends js.Object {
  
  /**
    * Google provided payment method data.
    * If your payment processor is listed as Google supported payment processor
    * here: https://developers.google.com/pay/api/ Navigate to your payment
    * processor through the link to find out more details.
    * Otherwise, refer to following documentation for payload details.
    * https://developers.google.com/pay/api/payment-data-cryptography
    */
  var googlePaymentData: js.UndefOr[String] = js.native
  
  /**
    * Merchant/Action provided payment method chosen by user.
    */
  var merchantPaymentMethodId: js.UndefOr[String] = js.native
}
object GoogleActionsTransactionsV3PaymentResult {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentResult]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentResultOps[Self <: GoogleActionsTransactionsV3PaymentResult] (val x: Self) extends AnyVal {
    
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
    def setGooglePaymentData(value: String): Self = this.set("googlePaymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePaymentData: Self = this.set("googlePaymentData", js.undefined)
    
    @scala.inline
    def setMerchantPaymentMethodId(value: String): Self = this.set("merchantPaymentMethodId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantPaymentMethodId: Self = this.set("merchantPaymentMethodId", js.undefined)
  }
}
