package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a box plot.
    */
  var BoxPlotAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BoxPlotAggregatedFieldWells] = js.undefined
}
object BoxPlotFieldWells {
  
  inline def apply(): BoxPlotFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotFieldWells] (val x: Self) extends AnyVal {
    
    inline def setBoxPlotAggregatedFieldWells(value: BoxPlotAggregatedFieldWells): Self = StObject.set(x, "BoxPlotAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setBoxPlotAggregatedFieldWellsUndefined: Self = StObject.set(x, "BoxPlotAggregatedFieldWells", js.undefined)
  }
}
