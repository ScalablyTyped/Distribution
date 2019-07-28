package typings.antdDashMobile.esModalModalMod

import typings.antdDashMobile.esModalPropsTypeMod.Action
import typings.antdDashMobile.esModalPropsTypeMod.ModalPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends ModalPropsType[CSSProperties] {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[Partial[HTMLProps[HTMLDivElement]]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: js.Any = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: js.Array[Action[CSSProperties]] = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onClose: () => Unit = null,
    operation: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    transitionName: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: Partial[HTMLProps[HTMLDivElement]] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible)
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps)
    __obj.asInstanceOf[ModalProps]
  }
}

