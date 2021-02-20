package typings.atom.anon

import typings.atom.mod.MarkerLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  groupingInterval :number | undefined} & atom.atom.HistoryTransactionOptions */
@js.native
trait groupingIntervalnumberund extends StObject {
  
  var groupingInterval: js.UndefOr[Double] = js.native
  
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.native
}
object groupingIntervalnumberund {
  
  @scala.inline
  def apply(): groupingIntervalnumberund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[groupingIntervalnumberund]
  }
  
  @scala.inline
  implicit class groupingIntervalnumberundMutableBuilder[Self <: groupingIntervalnumberund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupingInterval(value: Double): Self = StObject.set(x, "groupingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingIntervalUndefined: Self = StObject.set(x, "groupingInterval", js.undefined)
    
    @scala.inline
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = StObject.set(x, "selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsMarkerLayerUndefined: Self = StObject.set(x, "selectionsMarkerLayer", js.undefined)
  }
}
