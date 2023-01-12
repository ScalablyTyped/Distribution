package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersOrder extends StObject {
  
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    */
  var actionOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * If requested, customer info e.g. email will be passed back to the app.
    */
  var customerInfo: js.UndefOr[GoogleActionsV2OrdersCustomerInfo] = js.undefined
  
  /**
    * Reflect back the proposed order that caused the order.
    */
  var finalOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.undefined
  
  /**
    * Order id assigned by Google.
    */
  var googleOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time the order was created.
    */
  var orderDate: js.UndefOr[String] = js.undefined
  
  /**
    * Payment related info for the order.
    */
  var paymentInfo: js.UndefOr[GoogleActionsV2OrdersPaymentInfo] = js.undefined
}
object GoogleActionsV2OrdersOrder {
  
  inline def apply(): GoogleActionsV2OrdersOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersOrder] (val x: Self) extends AnyVal {
    
    inline def setActionOrderId(value: String): Self = StObject.set(x, "actionOrderId", value.asInstanceOf[js.Any])
    
    inline def setActionOrderIdUndefined: Self = StObject.set(x, "actionOrderId", js.undefined)
    
    inline def setCustomerInfo(value: GoogleActionsV2OrdersCustomerInfo): Self = StObject.set(x, "customerInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomerInfoUndefined: Self = StObject.set(x, "customerInfo", js.undefined)
    
    inline def setFinalOrder(value: GoogleActionsV2OrdersProposedOrder): Self = StObject.set(x, "finalOrder", value.asInstanceOf[js.Any])
    
    inline def setFinalOrderUndefined: Self = StObject.set(x, "finalOrder", js.undefined)
    
    inline def setGoogleOrderId(value: String): Self = StObject.set(x, "googleOrderId", value.asInstanceOf[js.Any])
    
    inline def setGoogleOrderIdUndefined: Self = StObject.set(x, "googleOrderId", js.undefined)
    
    inline def setOrderDate(value: String): Self = StObject.set(x, "orderDate", value.asInstanceOf[js.Any])
    
    inline def setOrderDateUndefined: Self = StObject.set(x, "orderDate", js.undefined)
    
    inline def setPaymentInfo(value: GoogleActionsV2OrdersPaymentInfo): Self = StObject.set(x, "paymentInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentInfoUndefined: Self = StObject.set(x, "paymentInfo", js.undefined)
  }
}
