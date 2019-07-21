package typings
package atAntDashDesignReactDashNativeLib.esPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps
  extends atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esPickerStyleMod.PickerStyle] {
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var popupPrefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData
    ],
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[java.lang.String] => java.lang.String = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onChange: /* date */ js.UndefOr[atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue] => scala.Unit = null,
    onPickerChange: /* value */ atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue => scala.Unit = null,
    pickerPrefixCls: java.lang.String = null,
    popupPrefixCls: java.lang.String = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esPickerStyleMod.PickerStyle] = null,
    value: js.Array[java.lang.String | scala.Double] = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerProps]
  }
}

