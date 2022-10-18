package typings.atom.anon

import typings.atom.dependenciesTextBufferSrcMarkerLayerMod.MarkerLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  groupingInterval :number | undefined} & atom.atom.HistoryTransactionOptions */
trait groupingIntervalnumberund extends StObject {
  
  var groupingInterval: js.UndefOr[Double] = js.undefined
  
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}
object groupingIntervalnumberund {
  
  inline def apply(): groupingIntervalnumberund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[groupingIntervalnumberund]
  }
  
  extension [Self <: groupingIntervalnumberund](x: Self) {
    
    inline def setGroupingInterval(value: Double): Self = StObject.set(x, "groupingInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupingIntervalUndefined: Self = StObject.set(x, "groupingInterval", js.undefined)
    
    inline def setSelectionsMarkerLayer(value: MarkerLayer): Self = StObject.set(x, "selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    inline def setSelectionsMarkerLayerUndefined: Self = StObject.set(x, "selectionsMarkerLayer", js.undefined)
  }
}
