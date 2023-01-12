package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3MerchantPaymentMethod extends StObject {
  
  /**
    * Required. Display info of this payment method.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.undefined
  
  /**
    * Optional. The group / profile name that the payment method belongs to.
    */
  var paymentMethodGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Id of the payment method passed from merchant / action.
    * Note this id is should be unique if multiple payment methods are sent from
    * Merchant/Action.
    */
  var paymentMethodId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Status of the payment method.
    * If not present, the payment method is assumed to be in OK status.
    */
  var paymentMethodStatus: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatus] = js.undefined
}
object GoogleActionsTransactionsV3MerchantPaymentMethod {
  
  inline def apply(): GoogleActionsTransactionsV3MerchantPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3MerchantPaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodDisplayInfo(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfo): Self = StObject.set(x, "paymentMethodDisplayInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodDisplayInfoUndefined: Self = StObject.set(x, "paymentMethodDisplayInfo", js.undefined)
    
    inline def setPaymentMethodGroup(value: String): Self = StObject.set(x, "paymentMethodGroup", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodGroupUndefined: Self = StObject.set(x, "paymentMethodGroup", js.undefined)
    
    inline def setPaymentMethodId(value: String): Self = StObject.set(x, "paymentMethodId", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodIdUndefined: Self = StObject.set(x, "paymentMethodId", js.undefined)
    
    inline def setPaymentMethodStatus(value: GoogleActionsTransactionsV3PaymentMethodStatus): Self = StObject.set(x, "paymentMethodStatus", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodStatusUndefined: Self = StObject.set(x, "paymentMethodStatus", js.undefined)
  }
}
