package typings
package atAntDashDesignReactDashNativeLib.esPickerPopupPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupPickerProps extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.undefined
  var actionTextActiveOpacity: js.UndefOr[scala.Double] = js.undefined
  var actionTextUnderlayColor: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactElement | java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dismissText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var okText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var picker: js.UndefOr[js.Any] = js.undefined
  var pickerValueChangeProp: js.UndefOr[java.lang.String] = js.undefined
  var pickerValueProp: js.UndefOr[java.lang.String] = js.undefined
  var popupTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var triggerType: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var wrapStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PopupPickerProps {
  @scala.inline
  def apply(
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: scala.Int | scala.Double = null,
    actionTextUnderlayColor: java.lang.String = null,
    content: reactLib.reactMod.ReactElement | java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dismissText: java.lang.String | reactLib.reactMod.ReactElement = null,
    maskTransitionName: java.lang.String = null,
    okText: java.lang.String | reactLib.reactMod.ReactElement = null,
    onDismiss: () => scala.Unit = null,
    onOk: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    picker: js.Any = null,
    pickerValueChangeProp: java.lang.String = null,
    pickerValueProp: java.lang.String = null,
    popupTransitionName: java.lang.String = null,
    style: js.Any = null,
    styles: js.Any = null,
    title: java.lang.String | reactLib.reactMod.ReactElement = null,
    transitionName: java.lang.String = null,
    triggerType: java.lang.String = null,
    value: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    wrapStyle: reactLib.reactMod.CSSProperties = null
  ): PopupPickerProps = {
    val __obj = js.Dynamic.literal()
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent)
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp)
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp)
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle)
    __obj.asInstanceOf[PopupPickerProps]
  }
}

