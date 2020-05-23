package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassAttr extends js.Object {
  var classAttr: js.UndefOr[String] = js.undefined
  var styleAttr: js.UndefOr[String] = js.undefined
}

object ClassAttr {
  @scala.inline
  def apply(classAttr: String = null, styleAttr: String = null): ClassAttr = {
    val __obj = js.Dynamic.literal()
    if (classAttr != null) __obj.updateDynamic("classAttr")(classAttr.asInstanceOf[js.Any])
    if (styleAttr != null) __obj.updateDynamic("styleAttr")(styleAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttr]
  }
}

