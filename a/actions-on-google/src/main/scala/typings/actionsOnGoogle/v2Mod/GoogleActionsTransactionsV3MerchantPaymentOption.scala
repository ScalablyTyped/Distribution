package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3MerchantPaymentOption extends StObject {
  
  /**
    * Optional. Id of the default payment method, if any.
    */
  var defaultMerchantPaymentMethodId: js.UndefOr[String] = js.native
  
  /**
    * Optional. A link to the action/merchant website for managing payment
    * method.
    */
  var managePaymentMethodUrl: js.UndefOr[String] = js.native
  
  /**
    * Required. List of payment methods provided by Action/Merchant.
    */
  var merchantPaymentMethod: js.UndefOr[js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]] = js.native
}
object GoogleActionsTransactionsV3MerchantPaymentOption {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3MerchantPaymentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentOption]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3MerchantPaymentOptionMutableBuilder[Self <: GoogleActionsTransactionsV3MerchantPaymentOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMerchantPaymentMethodId(value: String): Self = StObject.set(x, "defaultMerchantPaymentMethodId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMerchantPaymentMethodIdUndefined: Self = StObject.set(x, "defaultMerchantPaymentMethodId", js.undefined)
    
    @scala.inline
    def setManagePaymentMethodUrl(value: String): Self = StObject.set(x, "managePaymentMethodUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagePaymentMethodUrlUndefined: Self = StObject.set(x, "managePaymentMethodUrl", js.undefined)
    
    @scala.inline
    def setMerchantPaymentMethod(value: js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]): Self = StObject.set(x, "merchantPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantPaymentMethodUndefined: Self = StObject.set(x, "merchantPaymentMethod", js.undefined)
    
    @scala.inline
    def setMerchantPaymentMethodVarargs(value: GoogleActionsTransactionsV3MerchantPaymentMethod*): Self = StObject.set(x, "merchantPaymentMethod", js.Array(value :_*))
  }
}
