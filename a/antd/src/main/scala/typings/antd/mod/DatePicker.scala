package typings.antd.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antd.PickPickPickerDatePropsMo
import typings.antd.PickPickPickerTimePropsMo
import typings.antd.generatePickerMod.PickerProps
import typings.antd.generatePickerMod.RangePickerProps
import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "DatePicker")
@js.native
class DatePicker protected ()
  extends Component[PickerProps[Moment], js.Any, js.Any] {
  def this(props: PickerProps[Moment]) = this()
  def this(props: PickerProps[Moment], context: js.Any) = this()
}

@JSImport("antd", "DatePicker")
@js.native
object DatePicker
  extends Instantiable1[/* props */ PickerProps[Moment], Component[PickerProps[Moment], js.Any, js.Any]]
     with Instantiable2[
      /* props */ PickerProps[Moment], 
      /* context */ js.Any, 
      Component[PickerProps[Moment], js.Any, js.Any]
    ] {
  var MonthPicker: ComponentClass[PickPickPickerDatePropsMo, _] = js.native
  var RangePicker: ComponentClass[RangePickerProps[Moment], _] = js.native
  var TimePicker: ComponentClass[PickPickPickerTimePropsMo, _] = js.native
  var WeekPicker: ComponentClass[PickPickPickerDatePropsMo, _] = js.native
  var YearPicker: ComponentClass[PickPickPickerDatePropsMo, _] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[PickerProps[Moment]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], _]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], _]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[PickerProps[Moment]]] = js.native
}

