package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterPlotFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a scatter plot. The x and y-axes of scatter plots with aggregated field wells are aggregated by category, label, or both.
    */
  var ScatterPlotCategoricallyAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ScatterPlotCategoricallyAggregatedFieldWells] = js.undefined
  
  /**
    * The unaggregated field wells of a scatter plot. The x and y-axes of these scatter plots are unaggregated.
    */
  var ScatterPlotUnaggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ScatterPlotUnaggregatedFieldWells] = js.undefined
}
object ScatterPlotFieldWells {
  
  inline def apply(): ScatterPlotFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterPlotFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScatterPlotFieldWells] (val x: Self) extends AnyVal {
    
    inline def setScatterPlotCategoricallyAggregatedFieldWells(value: ScatterPlotCategoricallyAggregatedFieldWells): Self = StObject.set(x, "ScatterPlotCategoricallyAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setScatterPlotCategoricallyAggregatedFieldWellsUndefined: Self = StObject.set(x, "ScatterPlotCategoricallyAggregatedFieldWells", js.undefined)
    
    inline def setScatterPlotUnaggregatedFieldWells(value: ScatterPlotUnaggregatedFieldWells): Self = StObject.set(x, "ScatterPlotUnaggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setScatterPlotUnaggregatedFieldWellsUndefined: Self = StObject.set(x, "ScatterPlotUnaggregatedFieldWells", js.undefined)
  }
}
