package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBottomFilter extends StObject {
  
  /**
    * The aggregation and sort configuration of the top bottom filter.
    */
  var AggregationSortConfigurations: AggregationSortConfigurationList
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
    */
  var FilterId: ShortRestrictiveResourceId
  
  /**
    * The number of items to include in the top bottom filter results.
    */
  var Limit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The parameter whose value should be used for the filter value.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeGranularity] = js.undefined
}
object TopBottomFilter {
  
  inline def apply(
    AggregationSortConfigurations: AggregationSortConfigurationList,
    Column: ColumnIdentifier,
    FilterId: ShortRestrictiveResourceId
  ): TopBottomFilter = {
    val __obj = js.Dynamic.literal(AggregationSortConfigurations = AggregationSortConfigurations.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopBottomFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopBottomFilter] (val x: Self) extends AnyVal {
    
    inline def setAggregationSortConfigurations(value: AggregationSortConfigurationList): Self = StObject.set(x, "AggregationSortConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAggregationSortConfigurationsVarargs(value: AggregationSortConfiguration*): Self = StObject.set(x, "AggregationSortConfigurations", js.Array(value*))
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
  }
}
