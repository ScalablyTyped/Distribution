package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersOrderOptions extends StObject {
  
  /**
    * The app can request customer info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var customerInfoOptions: js.UndefOr[GoogleActionsV2OrdersCustomerInfoOptions] = js.undefined
  
  /**
    * If true, delivery address is required for the associated Order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined
}
object GoogleActionsV2OrdersOrderOptions {
  
  inline def apply(): GoogleActionsV2OrdersOrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersOrderOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomerInfoOptions(value: GoogleActionsV2OrdersCustomerInfoOptions): Self = StObject.set(x, "customerInfoOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomerInfoOptionsUndefined: Self = StObject.set(x, "customerInfoOptions", js.undefined)
    
    inline def setRequestDeliveryAddress(value: Boolean): Self = StObject.set(x, "requestDeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setRequestDeliveryAddressUndefined: Self = StObject.set(x, "requestDeliveryAddress", js.undefined)
  }
}
