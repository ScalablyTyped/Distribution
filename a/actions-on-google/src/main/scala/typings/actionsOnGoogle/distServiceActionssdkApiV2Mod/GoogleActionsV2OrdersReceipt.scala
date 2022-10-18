package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersReceipt extends StObject {
  
  /**
    * Optional. The user facing id referencing to current order, which will show
    * up in the receipt card if present. This should be the id that usually
    * appears on a printed receipt or receipt sent to user's email. User should
    * be able to use this id referencing her order for customer service provided
    * by integrators. Note that this field must be populated if integrator does
    * generate user facing id for an order with a printed receipt / email
    * receipt.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersReceipt {
  
  inline def apply(): GoogleActionsV2OrdersReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersReceipt]
  }
  
  extension [Self <: GoogleActionsV2OrdersReceipt](x: Self) {
    
    inline def setUserVisibleOrderId(value: String): Self = StObject.set(x, "userVisibleOrderId", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleOrderIdUndefined: Self = StObject.set(x, "userVisibleOrderId", js.undefined)
  }
}
