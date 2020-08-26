package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryTransactionOptions extends js.Object {
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.native
}

object HistoryTransactionOptions {
  @scala.inline
  def apply(): HistoryTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryTransactionOptions]
  }
  @scala.inline
  implicit class HistoryTransactionOptionsOps[Self <: HistoryTransactionOptions] (val x: Self) extends AnyVal {
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
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = this.set("selectionsMarkerLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionsMarkerLayer: Self = this.set("selectionsMarkerLayer", js.undefined)
  }
  
}

