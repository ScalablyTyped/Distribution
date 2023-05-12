package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboChartAggregatedFieldWells extends StObject {
  
  /**
    * The aggregated BarValues field well of a combo chart.
    */
  var BarValues: js.UndefOr[MeasureFieldList] = js.undefined
  
  /**
    * The aggregated category field wells of a combo chart.
    */
  var Category: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The aggregated colors field well of a combo chart.
    */
  var Colors: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The aggregated LineValues field well of a combo chart.
    */
  var LineValues: js.UndefOr[MeasureFieldList] = js.undefined
}
object ComboChartAggregatedFieldWells {
  
  inline def apply(): ComboChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setBarValues(value: MeasureFieldList): Self = StObject.set(x, "BarValues", value.asInstanceOf[js.Any])
    
    inline def setBarValuesUndefined: Self = StObject.set(x, "BarValues", js.undefined)
    
    inline def setBarValuesVarargs(value: MeasureField*): Self = StObject.set(x, "BarValues", js.Array(value*))
    
    inline def setCategory(value: DimensionFieldList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: DimensionField*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setColors(value: DimensionFieldList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    inline def setColorsVarargs(value: DimensionField*): Self = StObject.set(x, "Colors", js.Array(value*))
    
    inline def setLineValues(value: MeasureFieldList): Self = StObject.set(x, "LineValues", value.asInstanceOf[js.Any])
    
    inline def setLineValuesUndefined: Self = StObject.set(x, "LineValues", js.undefined)
    
    inline def setLineValuesVarargs(value: MeasureField*): Self = StObject.set(x, "LineValues", js.Array(value*))
  }
}
