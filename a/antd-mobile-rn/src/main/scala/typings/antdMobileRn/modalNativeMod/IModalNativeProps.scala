package typings.antdMobileRn.modalNativeMod

import typings.antdMobileRn.modalPropsTypeMod.Action
import typings.antdMobileRn.modalPropsTypeMod.ModalPropsType
import typings.antdMobileRn.modalStyleIndexNativeMod.IModalStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    bodyStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: js.Array[Action[TextStyle]] = null,
    locale: js.Object = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onClose: () => Unit = null,
    operation: js.UndefOr[Boolean] = js.undefined,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: IModalStyle = null,
    title: ReactNode = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): IModalNativeProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyStyle)) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.get.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalNativeProps]
  }
}

