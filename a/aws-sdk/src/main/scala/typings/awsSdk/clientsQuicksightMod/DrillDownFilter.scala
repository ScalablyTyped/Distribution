package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrillDownFilter extends StObject {
  
  /**
    * The category type drill down filter. This filter is used for string type columns.
    */
  var CategoryFilter: js.UndefOr[CategoryDrillDownFilter] = js.undefined
  
  /**
    * The numeric equality type drill down filter. This filter is used for number type columns.
    */
  var NumericEqualityFilter: js.UndefOr[NumericEqualityDrillDownFilter] = js.undefined
  
  /**
    * The time range drill down filter. This filter is used for date time columns.
    */
  var TimeRangeFilter: js.UndefOr[TimeRangeDrillDownFilter] = js.undefined
}
object DrillDownFilter {
  
  inline def apply(): DrillDownFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillDownFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrillDownFilter] (val x: Self) extends AnyVal {
    
    inline def setCategoryFilter(value: CategoryDrillDownFilter): Self = StObject.set(x, "CategoryFilter", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterUndefined: Self = StObject.set(x, "CategoryFilter", js.undefined)
    
    inline def setNumericEqualityFilter(value: NumericEqualityDrillDownFilter): Self = StObject.set(x, "NumericEqualityFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericEqualityFilterUndefined: Self = StObject.set(x, "NumericEqualityFilter", js.undefined)
    
    inline def setTimeRangeFilter(value: TimeRangeDrillDownFilter): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilterUndefined: Self = StObject.set(x, "TimeRangeFilter", js.undefined)
  }
}
