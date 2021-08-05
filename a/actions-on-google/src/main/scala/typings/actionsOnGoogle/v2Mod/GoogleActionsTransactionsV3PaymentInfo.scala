package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3PaymentInfo extends StObject {
  
  /**
    * The display info of the payment method used for the transaction.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.undefined
  
  /**
    * Provenance of the payment method used for the transaction.
    * User may have registered the same payment method with both google and
    * merchant.
    */
  var paymentMethodProvenance: js.UndefOr[GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance] = js.undefined
}
object GoogleActionsTransactionsV3PaymentInfo {
  
  inline def apply(): GoogleActionsTransactionsV3PaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentInfo]
  }
  
  extension [Self <: GoogleActionsTransactionsV3PaymentInfo](x: Self) {
    
    inline def setPaymentMethodDisplayInfo(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfo): Self = StObject.set(x, "paymentMethodDisplayInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodDisplayInfoUndefined: Self = StObject.set(x, "paymentMethodDisplayInfo", js.undefined)
    
    inline def setPaymentMethodProvenance(value: GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance): Self = StObject.set(x, "paymentMethodProvenance", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodProvenanceUndefined: Self = StObject.set(x, "paymentMethodProvenance", js.undefined)
  }
}
