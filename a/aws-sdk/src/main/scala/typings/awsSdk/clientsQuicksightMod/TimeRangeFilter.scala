package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeFilter extends StObject {
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The exclude period of the time range filter.
    */
  var ExcludePeriodConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExcludePeriodConfiguration] = js.undefined
  
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
  var RangeMaximumValue: js.UndefOr[TimeRangeFilterValue] = js.undefined
  
  /**
    * The minimum value for the filter value range.
    */
  var RangeMinimumValue: js.UndefOr[TimeRangeFilterValue] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeGranularity] = js.undefined
}
object TimeRangeFilter {
  
  inline def apply(Column: ColumnIdentifier, FilterId: ShortRestrictiveResourceId, NullOption: FilterNullOption): TimeRangeFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRangeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRangeFilter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setExcludePeriodConfiguration(value: ExcludePeriodConfiguration): Self = StObject.set(x, "ExcludePeriodConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExcludePeriodConfigurationUndefined: Self = StObject.set(x, "ExcludePeriodConfiguration", js.undefined)
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setIncludeMaximum(value: Boolean): Self = StObject.set(x, "IncludeMaximum", value.asInstanceOf[js.Any])
    
    inline def setIncludeMaximumUndefined: Self = StObject.set(x, "IncludeMaximum", js.undefined)
    
    inline def setIncludeMinimum(value: Boolean): Self = StObject.set(x, "IncludeMinimum", value.asInstanceOf[js.Any])
    
    inline def setIncludeMinimumUndefined: Self = StObject.set(x, "IncludeMinimum", js.undefined)
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setRangeMaximumValue(value: TimeRangeFilterValue): Self = StObject.set(x, "RangeMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setRangeMaximumValueUndefined: Self = StObject.set(x, "RangeMaximumValue", js.undefined)
    
    inline def setRangeMinimumValue(value: TimeRangeFilterValue): Self = StObject.set(x, "RangeMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setRangeMinimumValueUndefined: Self = StObject.set(x, "RangeMinimumValue", js.undefined)
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
  }
}
