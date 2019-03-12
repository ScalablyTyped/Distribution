package typings
package antdLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFuncProps extends js.Object {
  var autoFocusButton: js.UndefOr[scala.Null | antdLib.antdLibStrings.ok | antdLib.antdLibStrings.cancel] = js.undefined
  var cancelButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var cancelText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var getContainer: js.UndefOr[
    js.Function1[/* instance */ reactLib.reactMod.ReactNs.ReactInstance, stdLib.HTMLElement]
  ] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconType: js.UndefOr[java.lang.String] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var okButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var okCancel: js.UndefOr[scala.Boolean] = js.undefined
  var okText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okType: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ModalFuncProps {
  @scala.inline
  def apply(
    autoFocusButton: antdLib.antdLibStrings.ok | antdLib.antdLibStrings.cancel = null,
    cancelButtonProps: antdLib.libButtonButtonMod.NativeButtonProps = null,
    cancelText: reactLib.reactMod.ReactNs.ReactNode = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    content: reactLib.reactMod.ReactNs.ReactNode = null,
    getContainer: /* instance */ reactLib.reactMod.ReactNs.ReactInstance => stdLib.HTMLElement = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    iconClassName: java.lang.String = null,
    iconType: java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    maskTransitionName: java.lang.String = null,
    okButtonProps: antdLib.libButtonButtonMod.NativeButtonProps = null,
    okCancel: js.UndefOr[scala.Boolean] = js.undefined,
    okText: reactLib.reactMod.ReactNs.ReactNode = null,
    okType: antdLib.libButtonButtonMod.ButtonType = null,
    onCancel: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    onOk: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    transitionName: java.lang.String = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): ModalFuncProps = {
    val __obj = js.Dynamic.literal()
    if (autoFocusButton != null) __obj.updateDynamic("autoFocusButton")(autoFocusButton.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction1(getContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps)
    if (!js.isUndefined(okCancel)) __obj.updateDynamic("okCancel")(okCancel)
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFuncProps]
  }
}

