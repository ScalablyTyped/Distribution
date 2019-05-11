package typings
package antdLib.esModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var cancelButtonProps: js.UndefOr[antdLib.esButtonButtonMod.NativeButtonProps] = js.undefined
  /** 取消按钮文字*/
  var cancelText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** 垂直居中 */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** 是否显示右上角的关闭按钮*/
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** 确定按钮 loading*/
  var confirmLoading: js.UndefOr[scala.Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined
  /** 底部内容*/
  var footer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** 强制渲染 Modal*/
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Function1[/* instance */ reactLib.reactMod.ReactInstance, stdLib.HTMLElement]] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /** 点击蒙层是否允许关闭*/
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var okButtonProps: js.UndefOr[antdLib.esButtonButtonMod.NativeButtonProps] = js.undefined
  /** 确认按钮文字*/
  var okText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** 确认按钮类型*/
  var okType: js.UndefOr[antdLib.esButtonButtonMod.ButtonType] = js.undefined
  /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调*/
  var onCancel: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit]
  ] = js.undefined
  /** 点击确定回调*/
  var onOk: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /** 标题*/
  var title: js.UndefOr[reactLib.reactMod.ReactNode | java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  /** 对话框是否可见*/
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** 宽度*/
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    afterClose: () => scala.Unit = null,
    bodyStyle: reactLib.reactMod.CSSProperties = null,
    cancelButtonProps: antdLib.esButtonButtonMod.NativeButtonProps = null,
    cancelText: reactLib.reactMod.ReactNode = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    confirmLoading: js.UndefOr[scala.Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    footer: reactLib.reactMod.ReactNode = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    getContainer: /* instance */ reactLib.reactMod.ReactInstance => stdLib.HTMLElement = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskStyle: reactLib.reactMod.CSSProperties = null,
    maskTransitionName: java.lang.String = null,
    okButtonProps: antdLib.esButtonButtonMod.NativeButtonProps = null,
    okText: reactLib.reactMod.ReactNode = null,
    okType: antdLib.esButtonButtonMod.ButtonType = null,
    onCancel: /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent] => scala.Unit = null,
    onOk: /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode | java.lang.String = null,
    transitionName: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    wrapClassName: java.lang.String = null,
    wrapProps: js.Any = null,
    zIndex: scala.Int | scala.Double = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(confirmLoading)) __obj.updateDynamic("confirmLoading")(confirmLoading)
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction1(getContainer))
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps)
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

