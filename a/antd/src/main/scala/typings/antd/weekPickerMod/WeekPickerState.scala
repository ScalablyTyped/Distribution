package typings.antd.weekPickerMod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekPickerState extends js.Object {
  var open: Boolean
  var value: Moment | Null
}

object WeekPickerState {
  @scala.inline
  def apply(open: Boolean, value: Moment = null): WeekPickerState = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekPickerState]
  }
}

