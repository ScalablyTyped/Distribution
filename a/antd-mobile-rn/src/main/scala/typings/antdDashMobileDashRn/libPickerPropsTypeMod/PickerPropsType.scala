package typings.antdDashMobileDashRn.libPickerPropsTypeMod

import typings.rmcDashCascader.libCascaderTypesMod.CascaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait PickerPropsType extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var data: js.Array[js.Array[PickerData] | PickerData]
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[js.Function1[/* values */ js.Array[String], String]] = js.undefined
  var indicatorStyle: js.UndefOr[js.Any] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.undefined
  var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  var value: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object PickerPropsType {
  @scala.inline
  def apply(
    data: js.Array[js.Array[PickerData] | PickerData],
    cascade: js.UndefOr[Boolean] = js.undefined,
    cols: Int | Double = null,
    extra: String = null,
    format: /* values */ js.Array[String] => String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Unit = null,
    onPickerChange: /* value */ CascaderValue => Unit = null,
    value: js.Array[String | Double] = null
  ): PickerPropsType = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerPropsType]
  }
}

