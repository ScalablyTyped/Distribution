package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersRejectionInfo extends StObject {
  
  /**
    * Reason for the error.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * Rejection type.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersRejectionInfoType] = js.native
}
object GoogleActionsV2OrdersRejectionInfo {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersRejectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersRejectionInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersRejectionInfoMutableBuilder[Self <: GoogleActionsV2OrdersRejectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersRejectionInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
