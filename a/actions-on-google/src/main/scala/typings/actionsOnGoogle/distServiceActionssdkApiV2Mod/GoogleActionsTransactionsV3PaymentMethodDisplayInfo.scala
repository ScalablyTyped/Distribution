package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentMethodDisplayInfo extends StObject {
  
  /**
    * User visible name of the payment method. For example,
    * VISA **** 1234
    * Checking acct **** 5678
    */
  var paymentMethodDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the payment.
    */
  var paymentType: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType] = js.undefined
}
object GoogleActionsTransactionsV3PaymentMethodDisplayInfo {
  
  inline def apply(): GoogleActionsTransactionsV3PaymentMethodDisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodDisplayInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3PaymentMethodDisplayInfo] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodDisplayName(value: String): Self = StObject.set(x, "paymentMethodDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodDisplayNameUndefined: Self = StObject.set(x, "paymentMethodDisplayName", js.undefined)
    
    inline def setPaymentType(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
