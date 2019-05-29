package typings
package antdDashMobileDashRnLib.libPickerIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerNativeProps
  extends antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerPropsType {
  var styles: js.UndefOr[antdDashMobileDashRnLib.libPickerStyleIndexDotNativeMod.IPickerStyle] = js.undefined
}

object PickerNativeProps {
  @scala.inline
  def apply(
    data: js.Array[
      js.Array[antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerData] | antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerData
    ],
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[java.lang.String] => java.lang.String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* date */ js.UndefOr[rmcDashCascaderLib.libCascaderTypesMod.CascaderValue] => scala.Unit = null,
    onPickerChange: /* value */ rmcDashCascaderLib.libCascaderTypesMod.CascaderValue => scala.Unit = null,
    styles: antdDashMobileDashRnLib.libPickerStyleIndexDotNativeMod.IPickerStyle = null,
    value: js.Array[java.lang.String | scala.Double] = null
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

