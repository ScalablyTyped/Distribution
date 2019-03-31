package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[T] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var text: java.lang.String
}

object Anon_ClassName {
  @scala.inline
  def apply[T](
    text: java.lang.String,
    className: java.lang.String = null,
    onPress: () => scala.Unit = null,
    style: T = null
  ): Anon_ClassName[T] = {
    val __obj = js.Dynamic.literal(text = text)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName[T]]
  }
}

