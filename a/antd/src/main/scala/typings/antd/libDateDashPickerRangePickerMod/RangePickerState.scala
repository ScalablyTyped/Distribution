package typings.antd.libDateDashPickerRangePickerMod

import typings.antd.libDateDashPickerInterfaceMod.RangePickerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePickerState extends js.Object {
  var hoverValue: js.UndefOr[RangePickerValue] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var showDate: js.UndefOr[RangePickerValue] = js.undefined
  var value: js.UndefOr[RangePickerValue] = js.undefined
}

object RangePickerState {
  @scala.inline
  def apply(
    hoverValue: RangePickerValue = null,
    open: js.UndefOr[Boolean] = js.undefined,
    showDate: RangePickerValue = null,
    value: RangePickerValue = null
  ): RangePickerState = {
    val __obj = js.Dynamic.literal()
    if (hoverValue != null) __obj.updateDynamic("hoverValue")(hoverValue.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (showDate != null) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerState]
  }
}

