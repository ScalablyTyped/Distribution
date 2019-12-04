package typings.antdDashMobileDashRn.libModalOperationContainerDotNativeMod

import typings.antdDashMobileDashRn.libModalPropsTypeMod.Action
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
}

object OperationContainerProps {
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]], onAnimationEnd: /* visible */ Boolean => Unit = null): OperationContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    __obj.asInstanceOf[OperationContainerProps]
  }
}

