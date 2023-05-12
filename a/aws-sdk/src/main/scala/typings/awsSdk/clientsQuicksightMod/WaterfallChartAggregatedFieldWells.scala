package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartAggregatedFieldWells extends StObject {
  
  /**
    * The breakdown field wells of a waterfall visual.
    */
  var Breakdowns: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The category field wells of a waterfall visual.
    */
  var Categories: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The value field wells of a waterfall visual.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object WaterfallChartAggregatedFieldWells {
  
  inline def apply(): WaterfallChartAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setBreakdowns(value: DimensionFieldList): Self = StObject.set(x, "Breakdowns", value.asInstanceOf[js.Any])
    
    inline def setBreakdownsUndefined: Self = StObject.set(x, "Breakdowns", js.undefined)
    
    inline def setBreakdownsVarargs(value: DimensionField*): Self = StObject.set(x, "Breakdowns", js.Array(value*))
    
    inline def setCategories(value: DimensionFieldList): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    inline def setCategoriesVarargs(value: DimensionField*): Self = StObject.set(x, "Categories", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
