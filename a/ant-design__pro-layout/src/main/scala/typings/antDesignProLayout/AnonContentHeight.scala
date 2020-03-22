package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentHeight extends js.Object {
  var contentHeight: js.UndefOr[Double] = js.undefined
}

object AnonContentHeight {
  @scala.inline
  def apply(contentHeight: Int | Double = null): AnonContentHeight = {
    val __obj = js.Dynamic.literal()
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentHeight]
  }
}

