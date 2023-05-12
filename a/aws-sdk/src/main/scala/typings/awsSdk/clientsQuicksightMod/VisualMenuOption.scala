package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualMenuOption extends StObject {
  
  /**
    * The availaiblity status of a visual's menu options.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object VisualMenuOption {
  
  inline def apply(): VisualMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualMenuOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualMenuOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
