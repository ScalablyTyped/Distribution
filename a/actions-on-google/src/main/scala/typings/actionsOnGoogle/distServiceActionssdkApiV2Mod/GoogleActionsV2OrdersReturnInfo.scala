package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersReturnInfo extends StObject {
  
  /**
    * Reason for return.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersReturnInfo {
  
  inline def apply(): GoogleActionsV2OrdersReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersReturnInfo]
  }
  
  extension [Self <: GoogleActionsV2OrdersReturnInfo](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
