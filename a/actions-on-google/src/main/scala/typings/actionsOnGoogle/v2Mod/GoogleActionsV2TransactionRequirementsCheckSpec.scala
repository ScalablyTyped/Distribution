package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TransactionRequirementsCheckSpec extends StObject {
  
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.native
  
  /**
    * Payment options for this Order, or empty if no payment
    * is associated with the Order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.native
}
object GoogleActionsV2TransactionRequirementsCheckSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2TransactionRequirementsCheckSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TransactionRequirementsCheckSpecMutableBuilder[Self <: GoogleActionsV2TransactionRequirementsCheckSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderOptions(value: GoogleActionsV2OrdersOrderOptions): Self = StObject.set(x, "orderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderOptionsUndefined: Self = StObject.set(x, "orderOptions", js.undefined)
    
    @scala.inline
    def setPaymentOptions(value: GoogleActionsV2OrdersPaymentOptions): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
  }
}
