package typings.antd.createPickerMod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerState extends js.Object {
  var open: Boolean
  var showDate: Moment | Null
  var value: Moment | Null
}

object PickerState {
  @scala.inline
  def apply(open: Boolean, showDate: Moment = null, value: Moment = null): PickerState = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (showDate != null) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerState]
  }
}

