package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartFieldWells extends StObject {
  
  /**
    * The field well configuration of a waterfall visual.
    */
  var WaterfallChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WaterfallChartAggregatedFieldWells] = js.undefined
}
object WaterfallChartFieldWells {
  
  inline def apply(): WaterfallChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setWaterfallChartAggregatedFieldWells(value: WaterfallChartAggregatedFieldWells): Self = StObject.set(x, "WaterfallChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setWaterfallChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "WaterfallChartAggregatedFieldWells", js.undefined)
  }
}
