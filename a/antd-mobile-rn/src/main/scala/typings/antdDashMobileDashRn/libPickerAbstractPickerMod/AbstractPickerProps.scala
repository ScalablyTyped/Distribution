package typings.antdDashMobileDashRn.libPickerAbstractPickerMod

import typings.antdDashMobileDashRn.libPickerPropsTypeMod.PickerData
import typings.antdDashMobileDashRn.libPickerPropsTypeMod.PickerPropsType
import typings.rmcDashCascader.libCascaderTypesMod.CascaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPickerProps extends PickerPropsType {
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var popupPrefixCls: js.UndefOr[String] = js.undefined
}

object AbstractPickerProps {
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
    pickerPrefixCls: String = null,
    popupPrefixCls: String = null,
    value: js.Array[String | Double] = null
  ): AbstractPickerProps = {
    val __obj = js.Dynamic.literal(data = data)
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

