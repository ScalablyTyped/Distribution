package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
}

object AnonScrollToFirstRowOnChange {
  @scala.inline
  def apply(scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined): AnonScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollToFirstRowOnChange)) __obj.updateDynamic("scrollToFirstRowOnChange")(scrollToFirstRowOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScrollToFirstRowOnChange]
  }
}

