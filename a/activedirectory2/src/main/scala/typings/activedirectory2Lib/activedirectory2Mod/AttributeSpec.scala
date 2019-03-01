package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSpec extends js.Object {
  var group: js.Array[activedirectory2Lib.GroupAttributes]
  var user: js.Array[activedirectory2Lib.UserAttributes]
}

object AttributeSpec {
  @scala.inline
  def apply(
    group: js.Array[activedirectory2Lib.GroupAttributes],
    user: js.Array[activedirectory2Lib.UserAttributes]
  ): AttributeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AttributeSpec]
  }
}

