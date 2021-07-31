package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2MediaStatus extends StObject {
  
  /**
    * The status of the media
    */
  var status: js.UndefOr[GoogleActionsV2MediaStatusStatus] = js.undefined
}
object GoogleActionsV2MediaStatus {
  
  @scala.inline
  def apply(): GoogleActionsV2MediaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaStatus]
  }
  
  @scala.inline
  implicit class GoogleActionsV2MediaStatusMutableBuilder[Self <: GoogleActionsV2MediaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GoogleActionsV2MediaStatusStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
