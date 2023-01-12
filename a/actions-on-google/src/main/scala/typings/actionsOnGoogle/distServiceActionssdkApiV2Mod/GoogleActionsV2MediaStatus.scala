package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

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
  
  inline def apply(): GoogleActionsV2MediaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2MediaStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: GoogleActionsV2MediaStatusStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
