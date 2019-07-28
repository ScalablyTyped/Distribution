package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}

object Input {
  @scala.inline
  def apply(bindingPropertyName: String = null): Input = {
    val __obj = js.Dynamic.literal()
    if (bindingPropertyName != null) __obj.updateDynamic("bindingPropertyName")(bindingPropertyName)
    __obj.asInstanceOf[Input]
  }
}

