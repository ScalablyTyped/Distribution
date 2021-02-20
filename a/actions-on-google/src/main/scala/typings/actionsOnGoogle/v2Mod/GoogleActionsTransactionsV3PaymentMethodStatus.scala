package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentMethodStatus extends StObject {
  
  var status: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatusStatus] = js.native
  
  /**
    * User facing message regarding the payment method status, i.e. \"Expired\".
    * Only required when payment method requires fix or is inapplicable.
    */
  var statusMessage: js.UndefOr[String] = js.native
}
object GoogleActionsTransactionsV3PaymentMethodStatus {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentMethodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodStatus]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentMethodStatusMutableBuilder[Self <: GoogleActionsTransactionsV3PaymentMethodStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GoogleActionsTransactionsV3PaymentMethodStatusStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
