package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryTraversalOptions extends js.Object {
  /** Restore snapshot of selections marker layer to given selectionsMarkerLayer. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}

object HistoryTraversalOptions {
  @scala.inline
  def apply(selectionsMarkerLayer: MarkerLayer = null): HistoryTraversalOptions = {
    val __obj = js.Dynamic.literal()
    if (selectionsMarkerLayer != null) __obj.updateDynamic("selectionsMarkerLayer")(selectionsMarkerLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryTraversalOptions]
  }
}

