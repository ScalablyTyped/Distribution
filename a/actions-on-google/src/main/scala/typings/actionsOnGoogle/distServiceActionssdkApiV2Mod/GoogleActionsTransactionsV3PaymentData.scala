package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentData extends StObject {
  
  /**
    * Payment information regarding the order that's useful for user facing
    * interaction.
    */
  var paymentInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentInfo] = js.undefined
  
  /**
    * Payment result that's used by integrator for completing a transaction.
    * This field will be populated by Actions on Google if the checkout
    * experience is managed by Actions-on-Google.
    */
  var paymentResult: js.UndefOr[GoogleActionsTransactionsV3PaymentResult] = js.undefined
}
object GoogleActionsTransactionsV3PaymentData {
  
  inline def apply(): GoogleActionsTransactionsV3PaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentData]
  }
  
  extension [Self <: GoogleActionsTransactionsV3PaymentData](x: Self) {
    
    inline def setPaymentInfo(value: GoogleActionsTransactionsV3PaymentInfo): Self = StObject.set(x, "paymentInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentInfoUndefined: Self = StObject.set(x, "paymentInfo", js.undefined)
    
    inline def setPaymentResult(value: GoogleActionsTransactionsV3PaymentResult): Self = StObject.set(x, "paymentResult", value.asInstanceOf[js.Any])
    
    inline def setPaymentResultUndefined: Self = StObject.set(x, "paymentResult", js.undefined)
  }
}
