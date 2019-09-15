package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdNumbers.`false`
import typings.antd.esButtonButtonMod.ButtonType
import typings.antd.esButtonButtonMod.NativeButtonProps
import typings.antd.esModalMod.default
import typings.antd.esModalModalMod.ModalProps
import typings.antd.esModalModalMod.getContainerFunc
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, width */
object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esModalMod.default].asInstanceOf[String | js.Object]
  def apply(
    afterClose: () => Unit = null,
    bodyStyle: CSSProperties = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: TagMod[Any] = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: TagMod[Any] = null,
    confirmLoading: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    footer: TagMod[Any] = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    maskTransitionName: String = null,
    okButtonProps: NativeButtonProps = null,
    okText: TagMod[Any] = null,
    okType: ButtonType = null,
    onCancel: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onOk: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    title: TagMod[Any] | String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    zIndex: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon)
    if (!js.isUndefined(confirmLoading)) __obj.updateDynamic("confirmLoading")(confirmLoading)
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (okType != null) __obj.updateDynamic("okType")(okType)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

