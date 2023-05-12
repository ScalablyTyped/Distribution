package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPointTooltipOption extends StObject {
  
  /**
    * The status of the data point tool tip options.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object DataPointTooltipOption {
  
  inline def apply(): DataPointTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPointTooltipOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPointTooltipOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
