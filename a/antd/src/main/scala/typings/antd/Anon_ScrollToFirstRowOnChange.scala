package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScrollToFirstRowOnChange extends js.Object {
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Boolean | Double | String] = js.undefined
  var y: js.UndefOr[Boolean | Double | String] = js.undefined
}

object Anon_ScrollToFirstRowOnChange {
  @scala.inline
  def apply(
    scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined,
    x: Boolean | Double | String = null,
    y: Boolean | Double | String = null
  ): Anon_ScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollToFirstRowOnChange)) __obj.updateDynamic("scrollToFirstRowOnChange")(scrollToFirstRowOnChange)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScrollToFirstRowOnChange]
  }
}

