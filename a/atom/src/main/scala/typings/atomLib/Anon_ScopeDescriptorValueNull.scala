package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueNull extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: java.lang.String | scala.Null
}

object Anon_ScopeDescriptorValueNull {
  @scala.inline
  def apply(scopeDescriptor: atomLib.atomMod.ScopeDescriptor, value: java.lang.String = null): Anon_ScopeDescriptorValueNull = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ScopeDescriptorValueNull]
  }
}

