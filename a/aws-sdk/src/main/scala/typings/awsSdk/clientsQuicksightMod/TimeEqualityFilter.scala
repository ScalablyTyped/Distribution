package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeEqualityFilter extends StObject {
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
    */
  var FilterId: ShortRestrictiveResourceId
  
  /**
    * The parameter whose value should be used for the filter value. This field is mutually exclusive to Value.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeGranularity] = js.undefined
  
  /**
    * The value of a TimeEquality filter. This field is mutually exclusive to ParameterName.
    */
  var Value: js.UndefOr[js.Date] = js.undefined
}
object TimeEqualityFilter {
  
  inline def apply(Column: ColumnIdentifier, FilterId: ShortRestrictiveResourceId): TimeEqualityFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FilterId = FilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeEqualityFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeEqualityFilter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterId", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
