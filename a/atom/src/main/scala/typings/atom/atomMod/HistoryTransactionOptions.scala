package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryTransactionOptions extends js.Object {
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}

object HistoryTransactionOptions {
  @scala.inline
  def apply(selectionsMarkerLayer: MarkerLayer = null): HistoryTransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (selectionsMarkerLayer != null) __obj.updateDynamic("selectionsMarkerLayer")(selectionsMarkerLayer)
    __obj.asInstanceOf[HistoryTransactionOptions]
  }
}

