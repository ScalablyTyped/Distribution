package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress[T] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var text: String
}

object AnonOnPress {
  @scala.inline
  def apply[T](text: String, className: String = null, onPress: () => Unit = null, style: T = null): AnonOnPress[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnPress[T]]
  }
}

