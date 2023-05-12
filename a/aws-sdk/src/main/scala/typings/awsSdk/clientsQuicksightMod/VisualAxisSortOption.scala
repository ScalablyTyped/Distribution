package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualAxisSortOption extends StObject {
  
  /**
    * The availaiblity status of a visual's axis sort options.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object VisualAxisSortOption {
  
  inline def apply(): VisualAxisSortOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualAxisSortOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualAxisSortOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
