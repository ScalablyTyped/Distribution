package typings.antd.timePickerMod

import typings.antd.PartialTimePickerPropsRef
import typings.antd.WeakValidationMapTimePick
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ForwardRefExoticComponent<antd.antd/lib/time-picker.TimePickerProps & react.react.RefAttributes<any>> & {  RangePicker  :react.react.ForwardRefExoticComponent<antd.antd/lib/time-picker.TimeRangePickerProps & react.react.RefAttributes<any>>} */
@js.native
trait MergedTimePicker extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var RangePicker: ForwardRefExoticComponent[TimeRangePickerProps with RefAttributes[_]] = js.native
  var defaultProps: js.UndefOr[PartialTimePickerPropsRef] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTimePick] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: TimePickerProps with RefAttributes[_]): ReactElement | Null = js.native
}

