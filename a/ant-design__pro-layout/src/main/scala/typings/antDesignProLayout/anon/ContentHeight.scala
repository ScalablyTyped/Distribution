package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentHeight extends js.Object {
  var contentHeight: js.UndefOr[Double] = js.undefined
}

object ContentHeight {
  @scala.inline
  def apply(contentHeight: js.UndefOr[Double] = js.undefined): ContentHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentHeight)) __obj.updateDynamic("contentHeight")(contentHeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeight]
  }
}

