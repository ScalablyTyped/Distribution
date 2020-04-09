package typings.antd

import typings.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var picker: js.UndefOr[PickerMode] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(format: String = null, picker: PickerMode = null): AnonFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

