package typings.antd.modalModalMod

import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.cancel
import typings.antd.antdStrings.ok
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.ButtonType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFuncProps extends js.Object {
  var autoFocusButton: js.UndefOr[Null | ok | cancel] = js.undefined
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.undefined
  var cancelText: js.UndefOr[ReactNode] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[ReactNode] = js.undefined
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var okButtonProps: js.UndefOr[ButtonProps] = js.undefined
  var okCancel: js.UndefOr[Boolean] = js.undefined
  var okText: js.UndefOr[ReactNode] = js.undefined
  var okType: js.UndefOr[ButtonType] = js.undefined
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ModalFuncProps {
  @scala.inline
  def apply(
    autoFocusButton: ok | cancel = null,
    cancelButtonProps: ButtonProps = null,
    cancelText: ReactNode = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: ReactNode = null,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    icon: ReactNode = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    maskTransitionName: String = null,
    okButtonProps: ButtonProps = null,
    okCancel: js.UndefOr[Boolean] = js.undefined,
    okText: ReactNode = null,
    okType: ButtonType = null,
    onCancel: /* repeated */ js.Any => _ = null,
    onOk: /* repeated */ js.Any => _ = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    transitionName: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    zIndex: Int | Double = null
  ): ModalFuncProps = {
    val __obj = js.Dynamic.literal()
    if (autoFocusButton != null) __obj.updateDynamic("autoFocusButton")(autoFocusButton.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(okCancel)) __obj.updateDynamic("okCancel")(okCancel.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFuncProps]
  }
}

