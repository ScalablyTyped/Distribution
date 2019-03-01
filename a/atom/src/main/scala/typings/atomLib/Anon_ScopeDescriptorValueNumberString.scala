package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueNumberString extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: java.lang.String | scala.Double
}

object Anon_ScopeDescriptorValueNumberString {
  @scala.inline
  def apply(scopeDescriptor: atomLib.atomMod.ScopeDescriptor, value: java.lang.String | scala.Double): Anon_ScopeDescriptorValueNumberString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescriptor")(scopeDescriptor)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScopeDescriptorValueNumberString]
  }
}

