package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TransactionDecisionValueSpec extends StObject {
  
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.native
  
  /**
    * Payment options for this order, or empty if no payment
    * is associated with the order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.native
  
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsV2OrdersPresentationOptions] = js.native
  
  /**
    * The proposed order that's ready for user to approve.
    */
  var proposedOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.native
}
object GoogleActionsV2TransactionDecisionValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TransactionDecisionValueSpecMutableBuilder[Self <: GoogleActionsV2TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderOptions(value: GoogleActionsV2OrdersOrderOptions): Self = StObject.set(x, "orderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderOptionsUndefined: Self = StObject.set(x, "orderOptions", js.undefined)
    
    @scala.inline
    def setPaymentOptions(value: GoogleActionsV2OrdersPaymentOptions): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
    
    @scala.inline
    def setPresentationOptions(value: GoogleActionsV2OrdersPresentationOptions): Self = StObject.set(x, "presentationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationOptionsUndefined: Self = StObject.set(x, "presentationOptions", js.undefined)
    
    @scala.inline
    def setProposedOrder(value: GoogleActionsV2OrdersProposedOrder): Self = StObject.set(x, "proposedOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedOrderUndefined: Self = StObject.set(x, "proposedOrder", js.undefined)
  }
}
