package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(attributeName: java.lang.String = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    __obj.asInstanceOf[Attribute]
  }
}

