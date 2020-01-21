package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Boolean | Double | String] = js.undefined
  var y: js.UndefOr[Boolean | Double | String] = js.undefined
}

object AnonScrollToFirstRowOnChange {
  @scala.inline
  def apply(
    scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined,
    x: Boolean | Double | String = null,
    y: Boolean | Double | String = null
  ): AnonScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollToFirstRowOnChange)) __obj.updateDynamic("scrollToFirstRowOnChange")(scrollToFirstRowOnChange.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScrollToFirstRowOnChange]
  }
}

