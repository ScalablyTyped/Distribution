package typings.athenajs.anon

import typings.athenajs.athenajsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop extends js.Object {
  var loop: js.UndefOr[`false`] = js.undefined
  var pan: js.UndefOr[Boolean] = js.undefined
}

object Loop {
  @scala.inline
  def apply(loop: `false` = null, pan: js.UndefOr[Boolean] = js.undefined): Loop = {
    val __obj = js.Dynamic.literal()
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
}

