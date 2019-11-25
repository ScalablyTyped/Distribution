package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueNull extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Null
}

object Anon_ScopeDescriptorValueNull {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String = null): Anon_ScopeDescriptorValueNull = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScopeDescriptorValueNull]
  }
}

