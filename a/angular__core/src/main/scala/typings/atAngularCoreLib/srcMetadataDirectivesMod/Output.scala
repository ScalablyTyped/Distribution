package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var bindingPropertyName: js.UndefOr[java.lang.String] = js.undefined
}

object Output {
  @scala.inline
  def apply(bindingPropertyName: java.lang.String = null): Output = {
    val __obj = js.Dynamic.literal()
    if (bindingPropertyName != null) __obj.updateDynamic("bindingPropertyName")(bindingPropertyName)
    __obj.asInstanceOf[Output]
  }
}

