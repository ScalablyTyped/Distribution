package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartAggregatedFieldWells extends StObject {
  
  /**
    * The category field wells of a line chart. Values are grouped by category fields.
    */
  var Category: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The color field wells of a line chart. Values are grouped by category fields.
    */
  var Colors: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The small multiples field well of a line chart.
    */
  var SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList] = js.undefined
  
  /**
    * The value field wells of a line chart. Values are aggregated based on categories.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object LineChartAggregatedFieldWells {
  
  inline def apply(): LineChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DimensionFieldList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: DimensionField*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setColors(value: DimensionFieldList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    inline def setColorsVarargs(value: DimensionField*): Self = StObject.set(x, "Colors", js.Array(value*))
    
    inline def setSmallMultiples(value: SmallMultiplesDimensionFieldList): Self = StObject.set(x, "SmallMultiples", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesUndefined: Self = StObject.set(x, "SmallMultiples", js.undefined)
    
    inline def setSmallMultiplesVarargs(value: DimensionField*): Self = StObject.set(x, "SmallMultiples", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
