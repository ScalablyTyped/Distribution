package typings.antd.anon

import typings.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var picker: js.UndefOr[PickerMode] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: String = null, picker: PickerMode = null): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

