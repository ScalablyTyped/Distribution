package typings.antdDashMobileDashRn.libModalModalDotNativeMod

import typings.antdDashMobileDashRn.libModalPropsTypeMod.Action
import typings.antdDashMobileDashRn.libModalPropsTypeMod.ModalPropsType
import typings.antdDashMobileDashRn.libModalStyleIndexDotNativeMod.IModalStyle
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalNativeProps extends ModalPropsType[TextStyle] {
  var bodyStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IModalStyle] = js.undefined
}

object IModalNativeProps {
  @scala.inline
  def apply(
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: js.Any = null,
    bodyStyle: StyleProp[ViewStyle] = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: js.Array[Action[TextStyle]] = null,
    locale: js.Object = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onClose: () => Unit = null,
    operation: js.UndefOr[Boolean] = js.undefined,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IModalStyle = null,
    title: ReactNode = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): IModalNativeProps = {
    val __obj = js.Dynamic.literal(visible = visible)
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[IModalNativeProps]
  }
}

