package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentResult extends StObject {
  
  /**
    * Google provided payment method data.
    * If your payment processor is listed as Google supported payment processor
    * here: https://developers.google.com/pay/api/ Navigate to your payment
    * processor through the link to find out more details.
    * Otherwise, refer to following documentation for payload details.
    * https://developers.google.com/pay/api/payment-data-cryptography
    */
  var googlePaymentData: js.UndefOr[String] = js.undefined
  
  /**
    * Merchant/Action provided payment method chosen by user.
    */
  var merchantPaymentMethodId: js.UndefOr[String] = js.undefined
}
object GoogleActionsTransactionsV3PaymentResult {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentResult]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentResultMutableBuilder[Self <: GoogleActionsTransactionsV3PaymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGooglePaymentData(value: String): Self = StObject.set(x, "googlePaymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePaymentDataUndefined: Self = StObject.set(x, "googlePaymentData", js.undefined)
    
    @scala.inline
    def setMerchantPaymentMethodId(value: String): Self = StObject.set(x, "merchantPaymentMethodId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantPaymentMethodIdUndefined: Self = StObject.set(x, "merchantPaymentMethodId", js.undefined)
  }
}
