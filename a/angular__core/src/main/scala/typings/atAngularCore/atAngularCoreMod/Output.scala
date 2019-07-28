package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * The name of the DOM property to which the output property is bound.
    */
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}

object Output {
  @scala.inline
  def apply(bindingPropertyName: String = null): Output = {
    val __obj = js.Dynamic.literal()
    if (bindingPropertyName != null) __obj.updateDynamic("bindingPropertyName")(bindingPropertyName)
    __obj.asInstanceOf[Output]
  }
}

