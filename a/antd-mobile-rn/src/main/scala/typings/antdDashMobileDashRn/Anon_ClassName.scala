package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[T] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var text: String
}

object Anon_ClassName {
  @scala.inline
  def apply[T](text: String, className: String = null, onPress: () => Unit = null, style: T = null): Anon_ClassName[T] = {
    val __obj = js.Dynamic.literal(text = text)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName[T]]
  }
}

