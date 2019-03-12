package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onDidClick: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    onDidClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    text: java.lang.String = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onDidClick != null) __obj.updateDynamic("onDidClick")(js.Any.fromFunction1(onDidClick))
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

