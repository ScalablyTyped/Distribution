package typings.antdDashMobileDashRn.libPickerIndexDotNativeMod

import typings.antdDashMobileDashRn.libPickerPropsTypeMod.PickerData
import typings.antdDashMobileDashRn.libPickerPropsTypeMod.PickerPropsType
import typings.antdDashMobileDashRn.libPickerStyleIndexDotNativeMod.IPickerStyle
import typings.rmcDashCascader.libCascaderTypesMod.CascaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerNativeProps extends PickerPropsType {
  var styles: js.UndefOr[IPickerStyle] = js.undefined
}

object PickerNativeProps {
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
    styles: IPickerStyle = null,
    value: js.Array[String | Double] = null
  ): PickerNativeProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerNativeProps]
  }
}

