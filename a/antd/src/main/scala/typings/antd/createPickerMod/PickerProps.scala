package typings.antd.createPickerMod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var prefixCls: String
  var value: js.UndefOr[Moment] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(prefixCls: String, open: js.UndefOr[Boolean] = js.undefined, value: Moment = null): PickerProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

