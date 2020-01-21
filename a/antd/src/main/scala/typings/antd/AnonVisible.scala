package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVisible extends js.Object {
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonVisible {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): AnonVisible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisible]
  }
}

