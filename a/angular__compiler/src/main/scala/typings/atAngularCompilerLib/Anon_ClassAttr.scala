package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassAttr extends js.Object {
  var classAttr: js.UndefOr[java.lang.String] = js.undefined
  var styleAttr: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassAttr {
  @scala.inline
  def apply(classAttr: java.lang.String = null, styleAttr: java.lang.String = null): Anon_ClassAttr = {
    val __obj = js.Dynamic.literal()
    if (classAttr != null) __obj.updateDynamic("classAttr")(classAttr)
    if (styleAttr != null) __obj.updateDynamic("styleAttr")(styleAttr)
    __obj.asInstanceOf[Anon_ClassAttr]
  }
}

