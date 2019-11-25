package typings.atAntDashDesignReactDashNative.libModalPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsType[T] extends js.Object {
  var animateAppear: js.UndefOr[Boolean] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animationType: js.UndefOr[js.Any] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[js.Array[Action[T]]] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var operation: js.UndefOr[Boolean] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var visible: Boolean
}

object ModalPropsType {
  @scala.inline
  def apply[T](
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: js.Any = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: js.Array[Action[T]] = null,
    locale: js.Object = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onClose: () => Unit = null,
    operation: js.UndefOr[Boolean] = js.undefined,
    popup: js.UndefOr[Boolean] = js.undefined,
    title: ReactNode = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): ModalPropsType[T] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalPropsType[T]]
  }
}

