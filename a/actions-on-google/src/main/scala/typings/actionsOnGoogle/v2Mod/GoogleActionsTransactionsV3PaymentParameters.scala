package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentParameters extends StObject {
  
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
  implicit class GoogleActionsTransactionsV3PaymentParametersMutableBuilder[Self <: GoogleActionsTransactionsV3PaymentParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGooglePaymentOption(value: GoogleActionsTransactionsV3GooglePaymentOption): Self = StObject.set(x, "googlePaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePaymentOptionUndefined: Self = StObject.set(x, "googlePaymentOption", js.undefined)
    
    @scala.inline
    def setMerchantPaymentOption(value: GoogleActionsTransactionsV3MerchantPaymentOption): Self = StObject.set(x, "merchantPaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantPaymentOptionUndefined: Self = StObject.set(x, "merchantPaymentOption", js.undefined)
  }
}
