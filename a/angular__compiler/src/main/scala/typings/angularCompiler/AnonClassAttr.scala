package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassAttr extends js.Object {
  var classAttr: js.UndefOr[String] = js.undefined
  var styleAttr: js.UndefOr[String] = js.undefined
}

object AnonClassAttr {
  @scala.inline
  def apply(classAttr: String = null, styleAttr: String = null): AnonClassAttr = {
    val __obj = js.Dynamic.literal()
    if (classAttr != null) __obj.updateDynamic("classAttr")(classAttr.asInstanceOf[js.Any])
    if (styleAttr != null) __obj.updateDynamic("styleAttr")(styleAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassAttr]
  }
}

