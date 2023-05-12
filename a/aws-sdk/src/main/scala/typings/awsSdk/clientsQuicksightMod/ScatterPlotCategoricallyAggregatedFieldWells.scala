package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterPlotCategoricallyAggregatedFieldWells extends StObject {
  
  /**
    * The category field well of a scatter plot.
    */
  var Category: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The label field well of a scatter plot.
    */
  var Label: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The size field well of a scatter plot.
    */
  var Size: js.UndefOr[MeasureFieldList] = js.undefined
  
  /**
    * The x-axis field well of a scatter plot. The x-axis is aggregated by category.
    */
  var XAxis: js.UndefOr[MeasureFieldList] = js.undefined
  
  /**
    * The y-axis field well of a scatter plot. The y-axis is aggregated by category.
    */
  var YAxis: js.UndefOr[MeasureFieldList] = js.undefined
}
object ScatterPlotCategoricallyAggregatedFieldWells {
  
  inline def apply(): ScatterPlotCategoricallyAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterPlotCategoricallyAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScatterPlotCategoricallyAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DimensionFieldList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: DimensionField*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setLabel(value: DimensionFieldList): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setLabelVarargs(value: DimensionField*): Self = StObject.set(x, "Label", js.Array(value*))
    
    inline def setSize(value: MeasureFieldList): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSizeVarargs(value: MeasureField*): Self = StObject.set(x, "Size", js.Array(value*))
    
    inline def setXAxis(value: MeasureFieldList): Self = StObject.set(x, "XAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "XAxis", js.undefined)
    
    inline def setXAxisVarargs(value: MeasureField*): Self = StObject.set(x, "XAxis", js.Array(value*))
    
    inline def setYAxis(value: MeasureFieldList): Self = StObject.set(x, "YAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "YAxis", js.undefined)
    
    inline def setYAxisVarargs(value: MeasureField*): Self = StObject.set(x, "YAxis", js.Array(value*))
  }
}
