package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPointMenuLabelOption extends StObject {
  
  /**
    * The status of the data point menu options.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object DataPointMenuLabelOption {
  
  inline def apply(): DataPointMenuLabelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPointMenuLabelOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPointMenuLabelOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
