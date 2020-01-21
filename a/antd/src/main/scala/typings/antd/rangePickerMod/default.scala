package typings.antd.rangePickerMod

import typings.antd.AnonAllowClearSeparator
import typings.antd.AnonOpen
import typings.antd.AnonOpenShowDate
import typings.antd.AnonOpenValue
import typings.antd.AnonShowDate
import typings.antd.AnonValueRangePickerValue
import typings.antd.interfaceMod.RangePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/RangePicker", JSImport.Default)
@js.native
class default protected () extends RangePicker {
  def this(props: js.Any) = this()
}

/* static members */
@JSImport("antd/lib/date-picker/RangePicker", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AnonAllowClearSeparator = js.native
  def getDerivedStateFromProps(nextProps: RangePickerProps, prevState: RangePickerState): AnonValueRangePickerValue | AnonShowDate | AnonOpen | AnonOpenValue | AnonOpenShowDate | Null = js.native
}

