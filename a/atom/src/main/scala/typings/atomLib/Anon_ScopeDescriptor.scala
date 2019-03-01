package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptor extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: js.Array[java.lang.String]
}

object Anon_ScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: atomLib.atomMod.ScopeDescriptor, value: js.Array[java.lang.String]): Anon_ScopeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescriptor")(scopeDescriptor)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ScopeDescriptor]
  }
}

