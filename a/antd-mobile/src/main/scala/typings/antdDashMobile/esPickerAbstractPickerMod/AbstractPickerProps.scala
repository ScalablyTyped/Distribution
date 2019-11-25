package typings.antdDashMobile.esPickerAbstractPickerMod

import typings.antdDashMobile.esPickerPropsTypeMod.PickerData
import typings.antdDashMobile.esPickerPropsTypeMod.PickerPropsType
import typings.react.reactMod.ReactNode
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
    format: /* values */ js.Array[ReactNode] => String | js.Array[ReactNode] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Unit = null,
    onPickerChange: /* value */ CascaderValue => Unit = null,
    pickerPrefixCls: String = null,
    popupPrefixCls: String = null,
    value: js.Array[String | Double] = null
  ): AbstractPickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractPickerProps]
  }
}

