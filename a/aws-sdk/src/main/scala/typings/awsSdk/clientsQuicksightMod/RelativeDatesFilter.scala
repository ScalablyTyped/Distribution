package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDatesFilter extends StObject {
  
  /**
    * The date configuration of the filter.
    */
  var AnchorDateConfiguration: typings.awsSdk.clientsQuicksightMod.AnchorDateConfiguration
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The configuration for the exclude period of the filter.
    */
  var ExcludePeriodConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExcludePeriodConfiguration] = js.undefined
  
  /**
    * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
    */
  var FilterId: ShortRestrictiveResourceId
  
  /**
    * The minimum granularity (period granularity) of the relative dates filter.
    */
  var MinimumGranularity: js.UndefOr[TimeGranularity] = js.undefined
  
  /**
    * This option determines how null values should be treated when filtering data.    ALL_VALUES: Include null values in filtered results.    NULLS_ONLY: Only include null values in filtered results.    NON_NULLS_ONLY: Exclude null values from filtered results.  
    */
  var NullOption: FilterNullOption
  
  /**
    * The parameter whose value should be used for the filter value.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
  
  /**
    * The range date type of the filter. Choose one of the options below:    PREVIOUS     THIS     LAST     NOW     NEXT   
    */
  var RelativeDateType: typings.awsSdk.clientsQuicksightMod.RelativeDateType
  
  /**
    * The date value of the filter.
    */
  var RelativeDateValue: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: typings.awsSdk.clientsQuicksightMod.TimeGranularity
}
object RelativeDatesFilter {
  
  inline def apply(
    AnchorDateConfiguration: AnchorDateConfiguration,
    Column: ColumnIdentifier,
    FilterId: ShortRestrictiveResourceId,
    NullOption: FilterNullOption,
    RelativeDateType: RelativeDateType,
    TimeGranularity: TimeGranularity
  ): RelativeDatesFilter = {
    val __obj = js.Dynamic.literal(AnchorDateConfiguration = AnchorDateConfiguration.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any], RelativeDateType = RelativeDateType.asInstanceOf[js.Any], TimeGranularity = TimeGranularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDatesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeDatesFilter] (val x: Self) extends AnyVal {
    
    inline def setAnchorDateConfiguration(value: AnchorDateConfiguration): Self = StObject.set(x, "AnchorDateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setExcludePeriodConfiguration(value: ExcludePeriodConfiguration): Self = StObject.set(x, "ExcludePeriodConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExcludePeriodConfigurationUndefined: Self = StObject.set(x, "ExcludePeriodConfiguration", js.undefined)
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setMinimumGranularity(value: TimeGranularity): Self = StObject.set(x, "MinimumGranularity", value.asInstanceOf[js.Any])
    
    inline def setMinimumGranularityUndefined: Self = StObject.set(x, "MinimumGranularity", js.undefined)
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setRelativeDateType(value: RelativeDateType): Self = StObject.set(x, "RelativeDateType", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateValue(value: Integer): Self = StObject.set(x, "RelativeDateValue", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateValueUndefined: Self = StObject.set(x, "RelativeDateValue", js.undefined)
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
  }
}
