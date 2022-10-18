package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersCancellationInfo extends StObject {
  
  /**
    * Reason for cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersCancellationInfo {
  
  inline def apply(): GoogleActionsV2OrdersCancellationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCancellationInfo]
  }
  
  extension [Self <: GoogleActionsV2OrdersCancellationInfo](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
