package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartAggregatedFieldWells extends StObject {
  
  /**
    * The aggregated field well categories of a radar chart.
    */
  var Category: js.UndefOr[RadarChartCategoryFieldList] = js.undefined
  
  /**
    * The color that are assigned to the aggregated field wells of a radar chart.
    */
  var Color: js.UndefOr[RadarChartColorFieldList] = js.undefined
  
  /**
    * The values that are assigned to the aggregated field wells of a radar chart.
    */
  var Values: js.UndefOr[RadarChartValuesFieldList] = js.undefined
}
object RadarChartAggregatedFieldWells {
  
  inline def apply(): RadarChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: RadarChartCategoryFieldList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: DimensionField*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setColor(value: RadarChartColorFieldList): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setColorVarargs(value: DimensionField*): Self = StObject.set(x, "Color", js.Array(value*))
    
    inline def setValues(value: RadarChartValuesFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
