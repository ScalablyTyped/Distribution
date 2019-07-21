package typings
package atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @ant-design/react-native.@ant-design/react-native/es/picker/PopupPickerTypes.PopupPickerProps, 'styles'> ]: @ant-design/react-native.@ant-design/react-native/es/picker/PopupPickerTypes.PopupPickerProps[P]} */ trait PickerPropsType extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var data: js.Array[js.Array[PickerData] | PickerData]
  var extra: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[js.Function1[/* values */ js.Array[java.lang.String], java.lang.String]] = js.undefined
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* date */ js.UndefOr[atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue], 
      scala.Unit
    ]
  ] = js.undefined
  var onPickerChange: js.UndefOr[
    js.Function1[
      /* value */ atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
}

object PickerPropsType {
  @scala.inline
  def apply(
    data: js.Array[js.Array[PickerData] | PickerData],
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[java.lang.String] => java.lang.String = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onChange: /* date */ js.UndefOr[atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue] => scala.Unit = null,
    onPickerChange: /* value */ atAntDashDesignReactDashNativeLib.esPickerCascaderCascaderTypesMod.CascaderValue => scala.Unit = null,
    value: js.Array[java.lang.String | scala.Double] = null
  ): PickerPropsType = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerPropsType]
  }
}

