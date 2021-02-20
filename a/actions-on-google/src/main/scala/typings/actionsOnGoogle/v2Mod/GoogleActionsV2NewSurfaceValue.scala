package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2NewSurfaceValue extends StObject {
  
  var status: js.UndefOr[GoogleActionsV2NewSurfaceValueStatus] = js.native
}
object GoogleActionsV2NewSurfaceValue {
  
  @scala.inline
  def apply(): GoogleActionsV2NewSurfaceValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValue]
  }
  
  @scala.inline
  implicit class GoogleActionsV2NewSurfaceValueMutableBuilder[Self <: GoogleActionsV2NewSurfaceValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GoogleActionsV2NewSurfaceValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
