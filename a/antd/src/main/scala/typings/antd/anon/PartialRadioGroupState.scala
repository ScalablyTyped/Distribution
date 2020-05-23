package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/radio/interface.RadioGroupState> */
trait PartialRadioGroupState extends js.Object {
  var prevPropValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PartialRadioGroupState {
  @scala.inline
  def apply(prevPropValue: js.Any = null, value: js.Any = null): PartialRadioGroupState = {
    val __obj = js.Dynamic.literal()
    if (prevPropValue != null) __obj.updateDynamic("prevPropValue")(prevPropValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRadioGroupState]
  }
}

