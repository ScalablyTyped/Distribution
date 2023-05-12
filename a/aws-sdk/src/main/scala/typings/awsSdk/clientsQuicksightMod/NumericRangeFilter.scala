package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericRangeFilter extends StObject {
  
  /**
    * The aggregation function of the filter.
    */
  var AggregationFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AggregationFunction] = js.undefined
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
    */
  var FilterId: ShortRestrictiveResourceId
  
  /**
    * Determines whether the maximum value in the filter value range should be included in the filtered results.
    */
  var IncludeMaximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the minimum value in the filter value range should be included in the filtered results.
    */
  var IncludeMinimum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option determines how null values should be treated when filtering data.    ALL_VALUES: Include null values in filtered results.    NULLS_ONLY: Only include null values in filtered results.    NON_NULLS_ONLY: Exclude null values from filtered results.  
    */
  var NullOption: FilterNullOption
  
  /**
    * The maximum value for the filter value range.
    */
  var RangeMaximum: js.UndefOr[NumericRangeFilterValue] = js.undefined
  
  /**
    * The minimum value for the filter value range.
    */
  var RangeMinimum: js.UndefOr[NumericRangeFilterValue] = js.undefined
  
  /**
    * Select all of the values. Null is not the assigned value of select all.    FILTER_ALL_VALUES   
    */
  var SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions] = js.undefined
}
object NumericRangeFilter {
  
  inline def apply(Column: ColumnIdentifier, FilterId: ShortRestrictiveResourceId, NullOption: FilterNullOption): NumericRangeFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericRangeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericRangeFilter] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setIncludeMaximum(value: Boolean): Self = StObject.set(x, "IncludeMaximum", value.asInstanceOf[js.Any])
    
    inline def setIncludeMaximumUndefined: Self = StObject.set(x, "IncludeMaximum", js.undefined)
    
    inline def setIncludeMinimum(value: Boolean): Self = StObject.set(x, "IncludeMinimum", value.asInstanceOf[js.Any])
    
    inline def setIncludeMinimumUndefined: Self = StObject.set(x, "IncludeMinimum", js.undefined)
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setRangeMaximum(value: NumericRangeFilterValue): Self = StObject.set(x, "RangeMaximum", value.asInstanceOf[js.Any])
    
    inline def setRangeMaximumUndefined: Self = StObject.set(x, "RangeMaximum", js.undefined)
    
    inline def setRangeMinimum(value: NumericRangeFilterValue): Self = StObject.set(x, "RangeMinimum", value.asInstanceOf[js.Any])
    
    inline def setRangeMinimumUndefined: Self = StObject.set(x, "RangeMinimum", js.undefined)
    
    inline def setSelectAllOptions(value: NumericFilterSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
  }
}
