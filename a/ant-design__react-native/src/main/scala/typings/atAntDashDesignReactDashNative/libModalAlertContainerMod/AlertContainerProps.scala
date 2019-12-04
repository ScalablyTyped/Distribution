package typings.atAntDashDesignReactDashNative.libModalAlertContainerMod

import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var content: ReactNode
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var title: ReactNode
}

object AlertContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: ReactNode = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null,
    title: ReactNode = null
  ): AlertContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertContainerProps]
  }
}

