package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2NewSurfaceValue extends StObject {
  
  var status: js.UndefOr[GoogleActionsV2NewSurfaceValueStatus] = js.undefined
}
object GoogleActionsV2NewSurfaceValue {
  
  inline def apply(): GoogleActionsV2NewSurfaceValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2NewSurfaceValue] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: GoogleActionsV2NewSurfaceValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
