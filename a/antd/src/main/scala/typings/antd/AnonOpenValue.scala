package typings.antd

import typings.antd.interfaceMod.RangePickerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpenValue extends js.Object {
  var open: js.UndefOr[Boolean] = js.undefined
  var value: RangePickerValue
}

object AnonOpenValue {
  @scala.inline
  def apply(value: RangePickerValue, open: js.UndefOr[Boolean] = js.undefined): AnonOpenValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpenValue]
  }
}

