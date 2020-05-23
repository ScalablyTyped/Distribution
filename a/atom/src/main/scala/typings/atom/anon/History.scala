package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var history: js.UndefOr[Boolean] = js.undefined
  var markerLayers: js.UndefOr[Boolean] = js.undefined
}

object History {
  @scala.inline
  def apply(history: js.UndefOr[Boolean] = js.undefined, markerLayers: js.UndefOr[Boolean] = js.undefined): History = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerLayers)) __obj.updateDynamic("markerLayers")(markerLayers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
}

