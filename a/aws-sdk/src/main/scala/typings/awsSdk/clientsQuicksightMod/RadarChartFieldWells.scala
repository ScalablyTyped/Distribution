package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a radar chart visual.
    */
  var RadarChartAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RadarChartAggregatedFieldWells] = js.undefined
}
object RadarChartFieldWells {
  
  inline def apply(): RadarChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setRadarChartAggregatedFieldWells(value: RadarChartAggregatedFieldWells): Self = StObject.set(x, "RadarChartAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setRadarChartAggregatedFieldWellsUndefined: Self = StObject.set(x, "RadarChartAggregatedFieldWells", js.undefined)
  }
}
