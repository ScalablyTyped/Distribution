package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var pending: js.UndefOr[Boolean] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(index: Int | Double = null, pending: js.UndefOr[Boolean] = js.undefined): AnonIndex = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

