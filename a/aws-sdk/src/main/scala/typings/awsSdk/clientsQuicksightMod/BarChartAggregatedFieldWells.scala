package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarChartAggregatedFieldWells extends StObject {
  
  /**
    * The category (y-axis) field well of a bar chart.
    */
  var Category: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The color (group/color) field well of a bar chart.
    */
  var Colors: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The small multiples field well of a bar chart.
    */
  var SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList] = js.undefined
  
  /**
    * The value field wells of a bar chart. Values are aggregated by category.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object BarChartAggregatedFieldWells {
  
  inline def apply(): BarChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
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
