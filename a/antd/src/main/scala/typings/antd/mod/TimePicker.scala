package typings.antd.mod

import typings.antd.AnonAlignDisabledHours
import typings.antd.AnonValueMoment
import typings.antd.timePickerMod.TimePickerProps
import typings.antd.timePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "TimePicker")
@js.native
class TimePicker protected () extends default {
  def this(props: TimePickerProps) = this()
}

/* static members */
@JSImport("antd", "TimePicker")
@js.native
object TimePicker extends js.Object {
  var defaultProps: AnonAlignDisabledHours = js.native
  def getDerivedStateFromProps(nextProps: TimePickerProps): AnonValueMoment | Null = js.native
}

