package typings.atAntDashDesignReactDashNative.esPickerMod

import typings.atAntDashDesignReactDashNative.PartialPickerStyle
import typings.atAntDashDesignReactDashNative.esPickerCascaderCascaderTypesMod.CascaderValue
import typings.atAntDashDesignReactDashNative.esPickerPropsTypeMod.PickerData
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/react-native.@ant-design/react-native/es/picker/PropsType.PickerPropsType */
/* Inlined parent @ant-design/react-native.@ant-design/react-native/es/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/es/picker/style.PickerStyle> */
trait PickerProps extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.undefined
  var actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
  var actionTextUnderlayColor: js.UndefOr[String] = js.undefined
  var cascade: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[ReactElement | String] = js.undefined
  var data: js.Array[js.Array[PickerData] | PickerData]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dismissText: js.UndefOr[String | ReactElement] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[js.Function1[/* values */ js.Array[String], String]] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String | ReactElement] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var picker: js.UndefOr[js.Any] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var pickerValueChangeProp: js.UndefOr[String] = js.undefined
  var pickerValueProp: js.UndefOr[String] = js.undefined
  var popupPrefixCls: js.UndefOr[String] = js.undefined
  var popupTransitionName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[PartialPickerStyle] = js.undefined
  var title: js.UndefOr[String | ReactElement] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var triggerType: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Array[String | Double]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wrapStyle: js.UndefOr[CSSProperties] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    data: js.Array[js.Array[PickerData] | PickerData],
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: Int | Double = null,
    actionTextUnderlayColor: String = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    cols: Int | Double = null,
    content: ReactElement | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: String | ReactElement = null,
    extra: String = null,
    format: /* values */ js.Array[String] => String = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    itemStyle: StyleProp[ViewStyle] = null,
    maskTransitionName: String = null,
    okText: String | ReactElement = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Unit = null,
    onDismiss: () => Unit = null,
    onOk: /* value */ js.UndefOr[js.Any] => Unit = null,
    onPickerChange: /* value */ CascaderValue => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    picker: js.Any = null,
    pickerPrefixCls: String = null,
    pickerValueChangeProp: String = null,
    pickerValueProp: String = null,
    popupPrefixCls: String = null,
    popupTransitionName: String = null,
    style: js.Any = null,
    styles: PartialPickerStyle = null,
    title: String | ReactElement = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Array[String | Double] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null
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

