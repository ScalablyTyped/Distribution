package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoscrollPreserveFolds extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoscrollPreserveFolds {
  @scala.inline
  def apply(autoscroll: js.UndefOr[Boolean] = js.undefined, preserveFolds: js.UndefOr[Boolean] = js.undefined): AnonAutoscrollPreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoscrollPreserveFolds]
  }
}

