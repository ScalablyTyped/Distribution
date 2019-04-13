package typings
package antdDashMobileLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends antdDashMobileLib.libModalPropsTypeMod.ModalPropsType[reactLib.reactMod.CSSProperties] {
  var bodyStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapProps: js.UndefOr[stdLib.Partial[reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    visible: scala.Boolean,
    animateAppear: js.UndefOr[scala.Boolean] = js.undefined,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationType: js.Any = null,
    bodyStyle: reactLib.reactMod.CSSProperties = null,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    footer: js.Array[antdDashMobileLib.libModalPropsTypeMod.Action[reactLib.reactMod.CSSProperties]] = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskTransitionName: java.lang.String = null,
    onAnimationEnd: /* visible */ scala.Boolean => scala.Unit = null,
    onClose: () => scala.Unit = null,
    operation: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    transitionName: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    wrapClassName: java.lang.String = null,
    wrapProps: stdLib.Partial[reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]] = null
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

