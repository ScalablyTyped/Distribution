package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSpec extends js.Object {
  var group: js.Array[GroupAttributes]
  var user: js.Array[UserAttributes]
}

object AttributeSpec {
  @scala.inline
  def apply(group: js.Array[GroupAttributes], user: js.Array[UserAttributes]): AttributeSpec = {
    val __obj = js.Dynamic.literal(group = group, user = user)
  
    __obj.asInstanceOf[AttributeSpec]
  }
}

