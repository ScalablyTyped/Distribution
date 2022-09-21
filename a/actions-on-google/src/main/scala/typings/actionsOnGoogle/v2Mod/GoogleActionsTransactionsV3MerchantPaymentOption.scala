package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3MerchantPaymentOption extends StObject {
  
  /**
    * Optional. Id of the default payment method, if any.
    */
  var defaultMerchantPaymentMethodId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A link to the action/merchant website for managing payment
    * method.
    */
  var managePaymentMethodUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Required. List of payment methods provided by Action/Merchant.
    */
  var merchantPaymentMethod: js.UndefOr[js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]] = js.undefined
}
object GoogleActionsTransactionsV3MerchantPaymentOption {
  
  inline def apply(): GoogleActionsTransactionsV3MerchantPaymentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentOption]
  }
  
  extension [Self <: GoogleActionsTransactionsV3MerchantPaymentOption](x: Self) {
    
    inline def setDefaultMerchantPaymentMethodId(value: String): Self = StObject.set(x, "defaultMerchantPaymentMethodId", value.asInstanceOf[js.Any])
    
    inline def setDefaultMerchantPaymentMethodIdUndefined: Self = StObject.set(x, "defaultMerchantPaymentMethodId", js.undefined)
    
    inline def setManagePaymentMethodUrl(value: String): Self = StObject.set(x, "managePaymentMethodUrl", value.asInstanceOf[js.Any])
    
    inline def setManagePaymentMethodUrlUndefined: Self = StObject.set(x, "managePaymentMethodUrl", js.undefined)
    
    inline def setMerchantPaymentMethod(value: js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]): Self = StObject.set(x, "merchantPaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setMerchantPaymentMethodUndefined: Self = StObject.set(x, "merchantPaymentMethod", js.undefined)
    
    inline def setMerchantPaymentMethodVarargs(value: GoogleActionsTransactionsV3MerchantPaymentMethod*): Self = StObject.set(x, "merchantPaymentMethod", js.Array(value*))
  }
}
