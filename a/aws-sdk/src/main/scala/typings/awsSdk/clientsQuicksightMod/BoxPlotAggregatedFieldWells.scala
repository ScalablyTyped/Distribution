package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotAggregatedFieldWells extends StObject {
  
  /**
    * The group by field well of a box plot chart. Values are grouped based on group by fields.
    */
  var GroupBy: js.UndefOr[BoxPlotDimensionFieldList] = js.undefined
  
  /**
    * The value field well of a box plot chart. Values are aggregated based on group by fields.
    */
  var Values: js.UndefOr[BoxPlotMeasureFieldList] = js.undefined
}
object BoxPlotAggregatedFieldWells {
  
  inline def apply(): BoxPlotAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setGroupBy(value: BoxPlotDimensionFieldList): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setGroupByVarargs(value: DimensionField*): Self = StObject.set(x, "GroupBy", js.Array(value*))
    
    inline def setValues(value: BoxPlotMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
