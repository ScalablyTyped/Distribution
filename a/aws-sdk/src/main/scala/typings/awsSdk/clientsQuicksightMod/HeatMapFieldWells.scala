package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a heat map.
    */
  var HeatMapAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HeatMapAggregatedFieldWells] = js.undefined
}
object HeatMapFieldWells {
  
  inline def apply(): HeatMapFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapFieldWells] (val x: Self) extends AnyVal {
    
    inline def setHeatMapAggregatedFieldWells(value: HeatMapAggregatedFieldWells): Self = StObject.set(x, "HeatMapAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setHeatMapAggregatedFieldWellsUndefined: Self = StObject.set(x, "HeatMapAggregatedFieldWells", js.undefined)
  }
}
