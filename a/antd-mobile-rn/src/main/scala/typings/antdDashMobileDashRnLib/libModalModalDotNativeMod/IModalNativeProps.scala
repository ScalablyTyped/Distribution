package typings
package antdDashMobileDashRnLib.libModalModalDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalNativeProps
  extends antdDashMobileDashRnLib.libModalPropsTypeMod.ModalPropsType[reactDashNativeLib.reactDashNativeMod.TextStyle] {
  var bodyStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libModalStyleIndexDotNativeMod.IModalStyle] = js.undefined
}

object IModalNativeProps {
  @scala.inline
  def apply(
    visible: scala.Boolean,
    animateAppear: js.UndefOr[scala.Boolean] = js.undefined,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationType: js.Any = null,
    bodyStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    footer: js.Array[
      antdDashMobileDashRnLib.libModalPropsTypeMod.Action[reactDashNativeLib.reactDashNativeMod.TextStyle]
    ] = null,
    locale: js.Object = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    onAnimationEnd: /* visible */ scala.Boolean => scala.Unit = null,
    onClose: () => scala.Unit = null,
    operation: js.UndefOr[scala.Boolean] = js.undefined,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.libModalStyleIndexDotNativeMod.IModalStyle = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
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

