package typings.atom.anon

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onDidClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ClassName {
  @scala.inline
  def apply(className: String = null, onDidClick: /* event */ MouseEvent => Unit = null, text: String = null): ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onDidClick != null) __obj.updateDynamic("onDidClick")(js.Any.fromFunction1(onDidClick))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

