package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History extends js.Object {
  var history: js.UndefOr[Boolean] = js.undefined
  var markerLayers: js.UndefOr[Boolean] = js.undefined
}

object Anon_History {
  @scala.inline
  def apply(history: js.UndefOr[Boolean] = js.undefined, markerLayers: js.UndefOr[Boolean] = js.undefined): Anon_History = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (!js.isUndefined(markerLayers)) __obj.updateDynamic("markerLayers")(markerLayers)
    __obj.asInstanceOf[Anon_History]
  }
}

