package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersRejectionInfo extends StObject {
  
  /**
    * Reason for the error.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * Rejection type.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersRejectionInfoType] = js.undefined
}
object GoogleActionsV2OrdersRejectionInfo {
  
  inline def apply(): GoogleActionsV2OrdersRejectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersRejectionInfo]
  }
  
  extension [Self <: GoogleActionsV2OrdersRejectionInfo](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setType(value: GoogleActionsV2OrdersRejectionInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
