package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValue extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: scala.Boolean
}

object Anon_ScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: atomLib.atomMod.ScopeDescriptor, value: scala.Boolean): Anon_ScopeDescriptorValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescriptor")(scopeDescriptor)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ScopeDescriptorValue]
  }
}

