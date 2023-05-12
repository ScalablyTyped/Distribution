package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPointDrillUpDownOption extends StObject {
  
  /**
    * The status of the drill down options of data points.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object DataPointDrillUpDownOption {
  
  inline def apply(): DataPointDrillUpDownOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPointDrillUpDownOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPointDrillUpDownOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
