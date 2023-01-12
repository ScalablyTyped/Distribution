package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetControlsOption extends StObject {
  
  /**
    * Visibility state.
    */
  var VisibilityState: js.UndefOr[DashboardUIState] = js.undefined
}
object SheetControlsOption {
  
  inline def apply(): SheetControlsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetControlsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetControlsOption] (val x: Self) extends AnyVal {
    
    inline def setVisibilityState(value: DashboardUIState): Self = StObject.set(x, "VisibilityState", value.asInstanceOf[js.Any])
    
    inline def setVisibilityStateUndefined: Self = StObject.set(x, "VisibilityState", js.undefined)
  }
}
