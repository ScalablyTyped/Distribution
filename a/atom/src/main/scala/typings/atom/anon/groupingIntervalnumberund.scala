package typings.atom.anon

import typings.atom.mod.MarkerLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  groupingInterval :number | undefined} & atom.atom.HistoryTransactionOptions */
@js.native
trait groupingIntervalnumberund extends js.Object {
  
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
  implicit class groupingIntervalnumberundOps[Self <: groupingIntervalnumberund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupingInterval(value: Double): Self = this.set("groupingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingInterval: Self = this.set("groupingInterval", js.undefined)
    
    @scala.inline
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = this.set("selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionsMarkerLayer: Self = this.set("selectionsMarkerLayer", js.undefined)
  }
}
