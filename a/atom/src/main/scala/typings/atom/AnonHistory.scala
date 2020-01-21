package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistory extends js.Object {
  var history: js.UndefOr[Boolean] = js.undefined
  var markerLayers: js.UndefOr[Boolean] = js.undefined
}

object AnonHistory {
  @scala.inline
  def apply(history: js.UndefOr[Boolean] = js.undefined, markerLayers: js.UndefOr[Boolean] = js.undefined): AnonHistory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(markerLayers)) __obj.updateDynamic("markerLayers")(markerLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHistory]
  }
}

