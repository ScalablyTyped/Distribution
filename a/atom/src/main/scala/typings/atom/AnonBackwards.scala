package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackwards extends js.Object {
  var backwards: js.UndefOr[Boolean] = js.undefined
}

object AnonBackwards {
  @scala.inline
  def apply(backwards: js.UndefOr[Boolean] = js.undefined): AnonBackwards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackwards]
  }
}

