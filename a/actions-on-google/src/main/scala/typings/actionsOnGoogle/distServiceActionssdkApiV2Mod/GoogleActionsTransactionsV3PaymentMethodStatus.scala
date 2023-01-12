package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentMethodStatus extends StObject {
  
  var status: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatusStatus] = js.undefined
  
  /**
    * User facing message regarding the payment method status, i.e. \"Expired\".
    * Only required when payment method requires fix or is inapplicable.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object GoogleActionsTransactionsV3PaymentMethodStatus {
  
  inline def apply(): GoogleActionsTransactionsV3PaymentMethodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3PaymentMethodStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: GoogleActionsTransactionsV3PaymentMethodStatusStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
