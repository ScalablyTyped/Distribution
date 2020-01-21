package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpen extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonOpen {
  @scala.inline
  def apply(open: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[scala.Nothing] = js.undefined): AnonOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpen]
  }
}

