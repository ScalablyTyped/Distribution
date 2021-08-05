package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentParameters extends StObject {
  
  /**
    * Info for requesting payment info from google.
    */
  var googlePaymentOption: js.UndefOr[GoogleActionsTransactionsV3GooglePaymentOption] = js.undefined
  
  /**
    * Info for payment methods provided by Action/Merchant.
    */
  var merchantPaymentOption: js.UndefOr[GoogleActionsTransactionsV3MerchantPaymentOption] = js.undefined
}
object GoogleActionsTransactionsV3PaymentParameters {
  
  inline def apply(): GoogleActionsTransactionsV3PaymentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentParameters]
  }
  
  extension [Self <: GoogleActionsTransactionsV3PaymentParameters](x: Self) {
    
    inline def setGooglePaymentOption(value: GoogleActionsTransactionsV3GooglePaymentOption): Self = StObject.set(x, "googlePaymentOption", value.asInstanceOf[js.Any])
    
    inline def setGooglePaymentOptionUndefined: Self = StObject.set(x, "googlePaymentOption", js.undefined)
    
    inline def setMerchantPaymentOption(value: GoogleActionsTransactionsV3MerchantPaymentOption): Self = StObject.set(x, "merchantPaymentOption", value.asInstanceOf[js.Any])
    
    inline def setMerchantPaymentOptionUndefined: Self = StObject.set(x, "merchantPaymentOption", js.undefined)
  }
}
