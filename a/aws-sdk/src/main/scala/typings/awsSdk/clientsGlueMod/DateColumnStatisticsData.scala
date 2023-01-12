package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateColumnStatisticsData extends StObject {
  
  /**
    * The highest value in the column.
    */
  var MaximumValue: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The lowest value in the column.
    */
  var MinimumValue: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong
}
object DateColumnStatisticsData {
  
  inline def apply(NumberOfDistinctValues: NonNegativeLong, NumberOfNulls: NonNegativeLong): DateColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateColumnStatisticsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateColumnStatisticsData] (val x: Self) extends AnyVal {
    
    inline def setMaximumValue(value: js.Date): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "MaximumValue", js.undefined)
    
    inline def setMinimumValue(value: js.Date): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "MinimumValue", js.undefined)
    
    inline def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
