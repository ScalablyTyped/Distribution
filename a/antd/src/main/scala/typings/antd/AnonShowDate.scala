package typings.antd

import typings.antd.interfaceMod.RangePickerValue
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowDate extends js.Object {
  var showDate: js.UndefOr[
    (js.Array[js.UndefOr[Moment | Null]]) | (js.Tuple2[js.UndefOr[Moment | Null], js.UndefOr[Moment | Null]])
  ] = js.undefined
  var value: RangePickerValue
}

object AnonShowDate {
  @scala.inline
  def apply(
    value: RangePickerValue,
    showDate: (js.Array[js.UndefOr[Moment | Null]]) | (js.Tuple2[js.UndefOr[Moment | Null], js.UndefOr[Moment | Null]]) = null
  ): AnonShowDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (showDate != null) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowDate]
  }
}

