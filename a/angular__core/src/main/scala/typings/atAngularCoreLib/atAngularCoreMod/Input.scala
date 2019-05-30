package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /**
    * The name of the DOM property to which the input property is bound.
    */
  var bindingPropertyName: js.UndefOr[java.lang.String] = js.undefined
}

object Input {
  @scala.inline
  def apply(bindingPropertyName: java.lang.String = null): Input = {
    val __obj = js.Dynamic.literal()
    if (bindingPropertyName != null) __obj.updateDynamic("bindingPropertyName")(bindingPropertyName)
    __obj.asInstanceOf[Input]
  }
}

