package typings.atom

import typings.atom.mod.MarkerLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  groupingInterval ? :number} & atom.atom.HistoryTransactionOptions */
trait groupingIntervalnumberHis extends js.Object {
  var groupingInterval: js.UndefOr[Double] = js.undefined
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}

object groupingIntervalnumberHis {
  @scala.inline
  def apply(groupingInterval: Int | Double = null, selectionsMarkerLayer: MarkerLayer = null): groupingIntervalnumberHis = {
    val __obj = js.Dynamic.literal()
    if (groupingInterval != null) __obj.updateDynamic("groupingInterval")(groupingInterval.asInstanceOf[js.Any])
    if (selectionsMarkerLayer != null) __obj.updateDynamic("selectionsMarkerLayer")(selectionsMarkerLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupingIntervalnumberHis]
  }
}

