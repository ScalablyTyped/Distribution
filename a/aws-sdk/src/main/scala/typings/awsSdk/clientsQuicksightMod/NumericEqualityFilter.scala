package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericEqualityFilter extends StObject {
  
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
    * The match operator that is used to determine if a filter should be applied.
    */
  var MatchOperator: NumericEqualityMatchOperator
  
  /**
    * This option determines how null values should be treated when filtering data.    ALL_VALUES: Include null values in filtered results.    NULLS_ONLY: Only include null values in filtered results.    NON_NULLS_ONLY: Exclude null values from filtered results.  
    */
  var NullOption: FilterNullOption
  
  /**
    * The parameter whose value should be used for the filter value.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
  
  /**
    * Select all of the values. Null is not the assigned value of select all.    FILTER_ALL_VALUES   
    */
  var SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions] = js.undefined
  
  /**
    * The input value.
    */
  var Value: js.UndefOr[Double] = js.undefined
}
object NumericEqualityFilter {
  
  inline def apply(
    Column: ColumnIdentifier,
    FilterId: ShortRestrictiveResourceId,
    MatchOperator: NumericEqualityMatchOperator,
    NullOption: FilterNullOption
  ): NumericEqualityFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any], MatchOperator = MatchOperator.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericEqualityFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericEqualityFilter] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setMatchOperator(value: NumericEqualityMatchOperator): Self = StObject.set(x, "MatchOperator", value.asInstanceOf[js.Any])
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setSelectAllOptions(value: NumericFilterSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
