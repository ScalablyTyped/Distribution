package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelChartFieldWells extends StObject {
  
  /**
    * The field well configuration of a FunnelChartVisual.
    */
  var FunnelChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FunnelChartAggregatedFieldWells] = js.undefined
}
object FunnelChartFieldWells {
  
  inline def apply(): FunnelChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setFunnelChartAggregatedFieldWells(value: FunnelChartAggregatedFieldWells): Self = StObject.set(x, "FunnelChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setFunnelChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "FunnelChartAggregatedFieldWells", js.undefined)
  }
}
