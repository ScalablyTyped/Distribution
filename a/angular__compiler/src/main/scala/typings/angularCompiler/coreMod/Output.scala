package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}

object Output {
  @scala.inline
  def apply(bindingPropertyName: String = null): Output = {
    val __obj = js.Dynamic.literal()
    if (bindingPropertyName != null) __obj.updateDynamic("bindingPropertyName")(bindingPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

