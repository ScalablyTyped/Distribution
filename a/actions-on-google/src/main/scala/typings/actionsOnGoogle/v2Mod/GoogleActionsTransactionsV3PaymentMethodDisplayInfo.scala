package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentMethodDisplayInfo extends StObject {
  
  /**
    * User visible name of the payment method. For example,
    * VISA **** 1234
    * Checking acct **** 5678
    */
  var paymentMethodDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The type of the payment.
    */
  var paymentType: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType] = js.native
}
object GoogleActionsTransactionsV3PaymentMethodDisplayInfo {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentMethodDisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodDisplayInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentMethodDisplayInfoMutableBuilder[Self <: GoogleActionsTransactionsV3PaymentMethodDisplayInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentMethodDisplayName(value: String): Self = StObject.set(x, "paymentMethodDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodDisplayNameUndefined: Self = StObject.set(x, "paymentMethodDisplayName", js.undefined)
    
    @scala.inline
    def setPaymentType(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
