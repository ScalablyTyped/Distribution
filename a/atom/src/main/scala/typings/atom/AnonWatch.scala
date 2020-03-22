package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWatch extends js.Object {
  var priority: js.UndefOr[Double] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object AnonWatch {
  @scala.inline
  def apply(priority: Int | Double = null, watch: js.UndefOr[Boolean] = js.undefined): AnonWatch = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWatch]
  }
}

