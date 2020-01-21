package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(attributeName: String = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

