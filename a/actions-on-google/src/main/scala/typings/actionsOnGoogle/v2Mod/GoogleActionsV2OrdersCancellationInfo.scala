package typings.actionsOnGoogle.v2Mod

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
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersCancellationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCancellationInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersCancellationInfoMutableBuilder[Self <: GoogleActionsV2OrdersCancellationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
