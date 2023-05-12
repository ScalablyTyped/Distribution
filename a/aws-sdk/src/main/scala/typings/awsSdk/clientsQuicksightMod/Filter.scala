package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * A CategoryFilter filters text values. For more information, see Adding text filters in the Amazon QuickSight User Guide.
    */
  var CategoryFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoryFilter] = js.undefined
  
  /**
    * A NumericEqualityFilter filters numeric values that equal or do not equal a given numeric value.
    */
  var NumericEqualityFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericEqualityFilter] = js.undefined
  
  /**
    * A NumericRangeFilter filters numeric values that are either inside or outside a given numeric range.
    */
  var NumericRangeFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericRangeFilter] = js.undefined
  
  /**
    * A RelativeDatesFilter filters date values that are relative to a given date.
    */
  var RelativeDatesFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RelativeDatesFilter] = js.undefined
  
  /**
    * A TimeEqualityFilter filters date-time values that equal or do not equal a given date/time value.
    */
  var TimeEqualityFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeEqualityFilter] = js.undefined
  
  /**
    * A TimeRangeFilter filters date-time values that are either inside or outside a given date/time range.
    */
  var TimeRangeFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeRangeFilter] = js.undefined
  
  /**
    * A TopBottomFilter filters data to the top or bottom values for a given column.
    */
  var TopBottomFilter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TopBottomFilter] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setCategoryFilter(value: CategoryFilter): Self = StObject.set(x, "CategoryFilter", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterUndefined: Self = StObject.set(x, "CategoryFilter", js.undefined)
    
    inline def setNumericEqualityFilter(value: NumericEqualityFilter): Self = StObject.set(x, "NumericEqualityFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericEqualityFilterUndefined: Self = StObject.set(x, "NumericEqualityFilter", js.undefined)
    
    inline def setNumericRangeFilter(value: NumericRangeFilter): Self = StObject.set(x, "NumericRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericRangeFilterUndefined: Self = StObject.set(x, "NumericRangeFilter", js.undefined)
    
    inline def setRelativeDatesFilter(value: RelativeDatesFilter): Self = StObject.set(x, "RelativeDatesFilter", value.asInstanceOf[js.Any])
    
    inline def setRelativeDatesFilterUndefined: Self = StObject.set(x, "RelativeDatesFilter", js.undefined)
    
    inline def setTimeEqualityFilter(value: TimeEqualityFilter): Self = StObject.set(x, "TimeEqualityFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeEqualityFilterUndefined: Self = StObject.set(x, "TimeEqualityFilter", js.undefined)
    
    inline def setTimeRangeFilter(value: TimeRangeFilter): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilterUndefined: Self = StObject.set(x, "TimeRangeFilter", js.undefined)
    
    inline def setTopBottomFilter(value: TopBottomFilter): Self = StObject.set(x, "TopBottomFilter", value.asInstanceOf[js.Any])
    
    inline def setTopBottomFilterUndefined: Self = StObject.set(x, "TopBottomFilter", js.undefined)
  }
}
