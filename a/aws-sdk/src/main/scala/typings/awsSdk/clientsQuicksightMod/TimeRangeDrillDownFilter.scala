package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeDrillDownFilter extends StObject {
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The maximum value for the filter value range.
    */
  var RangeMaximum: js.Date
  
  /**
    * The minimum value for the filter value range.
    */
  var RangeMinimum: js.Date
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: typings.awsSdk.clientsQuicksightMod.TimeGranularity
}
object TimeRangeDrillDownFilter {
  
  inline def apply(
    Column: ColumnIdentifier,
    RangeMaximum: js.Date,
    RangeMinimum: js.Date,
    TimeGranularity: TimeGranularity
  ): TimeRangeDrillDownFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], RangeMaximum = RangeMaximum.asInstanceOf[js.Any], RangeMinimum = RangeMinimum.asInstanceOf[js.Any], TimeGranularity = TimeGranularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRangeDrillDownFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRangeDrillDownFilter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setRangeMaximum(value: js.Date): Self = StObject.set(x, "RangeMaximum", value.asInstanceOf[js.Any])
    
    inline def setRangeMinimum(value: js.Date): Self = StObject.set(x, "RangeMinimum", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
  }
}
