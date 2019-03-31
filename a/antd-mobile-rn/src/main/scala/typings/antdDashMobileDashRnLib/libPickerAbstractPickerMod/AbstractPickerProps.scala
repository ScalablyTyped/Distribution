package typings
package antdDashMobileDashRnLib.libPickerAbstractPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPickerProps
  extends antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerPropsType {
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var popupPrefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object AbstractPickerProps {
  @scala.inline
  def apply(
    data: js.Array[antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerData] | js.Array[js.Array[antdDashMobileDashRnLib.libPickerPropsTypeMod.PickerData]],
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[java.lang.String] => java.lang.String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* date */ js.UndefOr[rmcDashCascaderLib.libCascaderTypesMod.CascaderValue] => scala.Unit = null,
    onPickerChange: /* value */ rmcDashCascaderLib.libCascaderTypesMod.CascaderValue => scala.Unit = null,
    pickerPrefixCls: java.lang.String = null,
    popupPrefixCls: java.lang.String = null,
    value: js.Array[java.lang.String | scala.Double] = null
  ): AbstractPickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AbstractPickerProps]
  }
}

