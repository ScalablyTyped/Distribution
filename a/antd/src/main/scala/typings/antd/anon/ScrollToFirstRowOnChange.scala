package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
}

object ScrollToFirstRowOnChange {
  @scala.inline
  def apply(scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined): ScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollToFirstRowOnChange)) __obj.updateDynamic("scrollToFirstRowOnChange")(scrollToFirstRowOnChange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToFirstRowOnChange]
  }
}

