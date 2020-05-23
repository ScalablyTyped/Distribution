package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/input/Input.InputState> */
trait PartialInputState extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var prevValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PartialInputState {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined, prevValue: js.Any = null, value: js.Any = null): PartialInputState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInputState]
  }
}

