package typings
package atAntDashDesignReactDashNativeLib.libModalPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var onPress: js.UndefOr[js.Function0[scala.Unit | js.Promise[_]]] = js.undefined
  var style: js.UndefOr[T | java.lang.String] = js.undefined
  var text: java.lang.String
}

object Action {
  @scala.inline
  def apply[T](
    text: java.lang.String,
    onPress: () => scala.Unit | js.Promise[_] = null,
    style: T | java.lang.String = null
  ): Action[T] = {
    val __obj = js.Dynamic.literal(text = text)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

