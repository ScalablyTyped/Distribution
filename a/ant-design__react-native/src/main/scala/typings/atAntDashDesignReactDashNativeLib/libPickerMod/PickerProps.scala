package typings
package atAntDashDesignReactDashNativeLib.libPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/picker/PropsType.PickerPropsType */
/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/picker/style.PickerStyle> */
trait PickerProps extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.undefined
  var actionTextActiveOpacity: js.UndefOr[scala.Double] = js.undefined
  var actionTextUnderlayColor: js.UndefOr[java.lang.String] = js.undefined
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactElement | java.lang.String] = js.undefined
  var data: js.Array[
    js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
  ]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dismissText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var extra: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[js.Function1[/* values */ js.Array[java.lang.String], java.lang.String]] = js.undefined
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var okText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* date */ js.UndefOr[
        atAntDashDesignReactDashNativeLib.libPickerCascaderCascaderTypesMod.CascaderValue
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onPickerChange: js.UndefOr[
    js.Function1[
      /* value */ atAntDashDesignReactDashNativeLib.libPickerCascaderCascaderTypesMod.CascaderValue, 
      scala.Unit
    ]
  ] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var picker: js.UndefOr[js.Any] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var pickerValueChangeProp: js.UndefOr[java.lang.String] = js.undefined
  var pickerValueProp: js.UndefOr[java.lang.String] = js.undefined
  var popupPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var popupTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[atAntDashDesignReactDashNativeLib.PartialPickerStyle] = js.undefined
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var triggerType: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var wrapStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
    ],
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: scala.Int | scala.Double = null,
    actionTextUnderlayColor: java.lang.String = null,
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    content: reactLib.reactMod.ReactElement | java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dismissText: java.lang.String | reactLib.reactMod.ReactElement = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[java.lang.String] => java.lang.String = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    maskTransitionName: java.lang.String = null,
    okText: java.lang.String | reactLib.reactMod.ReactElement = null,
    onChange: /* date */ js.UndefOr[
      atAntDashDesignReactDashNativeLib.libPickerCascaderCascaderTypesMod.CascaderValue
    ] => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onOk: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    onPickerChange: /* value */ atAntDashDesignReactDashNativeLib.libPickerCascaderCascaderTypesMod.CascaderValue => scala.Unit = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    picker: js.Any = null,
    pickerPrefixCls: java.lang.String = null,
    pickerValueChangeProp: java.lang.String = null,
    pickerValueProp: java.lang.String = null,
    popupPrefixCls: java.lang.String = null,
    popupTransitionName: java.lang.String = null,
    style: js.Any = null,
    styles: atAntDashDesignReactDashNativeLib.PartialPickerStyle = null,
    title: java.lang.String | reactLib.reactMod.ReactElement = null,
    transitionName: java.lang.String = null,
    triggerType: java.lang.String = null,
    value: js.Array[java.lang.String | scala.Double] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    wrapStyle: reactLib.reactMod.CSSProperties = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent)
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp)
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp)
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls)
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle)
    __obj.asInstanceOf[PickerProps]
  }
}

