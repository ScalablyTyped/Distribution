package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentParameters extends js.Object {
  
  /**
    * Info for requesting payment info from google.
    */
  var googlePaymentOption: js.UndefOr[GoogleActionsTransactionsV3GooglePaymentOption] = js.native
  
  /**
    * Info for payment methods provided by Action/Merchant.
    */
  var merchantPaymentOption: js.UndefOr[GoogleActionsTransactionsV3MerchantPaymentOption] = js.native
}
object GoogleActionsTransactionsV3PaymentParameters {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentParameters]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentParametersOps[Self <: GoogleActionsTransactionsV3PaymentParameters] (val x: Self) extends AnyVal {
    
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
    def setGooglePaymentOption(value: GoogleActionsTransactionsV3GooglePaymentOption): Self = this.set("googlePaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePaymentOption: Self = this.set("googlePaymentOption", js.undefined)
    
    @scala.inline
    def setMerchantPaymentOption(value: GoogleActionsTransactionsV3MerchantPaymentOption): Self = this.set("merchantPaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantPaymentOption: Self = this.set("merchantPaymentOption", js.undefined)
  }
}
