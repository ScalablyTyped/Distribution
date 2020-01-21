package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoscroll extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoscroll {
  @scala.inline
  def apply(autoscroll: js.UndefOr[Boolean] = js.undefined): AnonAutoscroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoscroll]
  }
}

