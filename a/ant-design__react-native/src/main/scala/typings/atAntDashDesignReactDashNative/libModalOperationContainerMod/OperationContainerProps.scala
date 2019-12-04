package typings.atAntDashDesignReactDashNative.libModalOperationContainerMod

import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
}

object OperationContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null
  ): OperationContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    __obj.asInstanceOf[OperationContainerProps]
  }
}

