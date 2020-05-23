package typings.atom.anon

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
  def apply(groupingInterval: js.UndefOr[Double] = js.undefined, selectionsMarkerLayer: MarkerLayer = null): groupingIntervalnumberHis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(groupingInterval)) __obj.updateDynamic("groupingInterval")(groupingInterval.get.asInstanceOf[js.Any])
    if (selectionsMarkerLayer != null) __obj.updateDynamic("selectionsMarkerLayer")(selectionsMarkerLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupingIntervalnumberHis]
  }
}

