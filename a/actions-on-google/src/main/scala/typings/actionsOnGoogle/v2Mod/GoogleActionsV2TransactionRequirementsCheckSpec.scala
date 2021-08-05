package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2TransactionRequirementsCheckSpec extends StObject {
  
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.undefined
  
  /**
    * Payment options for this Order, or empty if no payment
    * is associated with the Order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.undefined
}
object GoogleActionsV2TransactionRequirementsCheckSpec {
  
  inline def apply(): GoogleActionsV2TransactionRequirementsCheckSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckSpec]
  }
  
  extension [Self <: GoogleActionsV2TransactionRequirementsCheckSpec](x: Self) {
    
    inline def setOrderOptions(value: GoogleActionsV2OrdersOrderOptions): Self = StObject.set(x, "orderOptions", value.asInstanceOf[js.Any])
    
    inline def setOrderOptionsUndefined: Self = StObject.set(x, "orderOptions", js.undefined)
    
    inline def setPaymentOptions(value: GoogleActionsV2OrdersPaymentOptions): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
  }
}
