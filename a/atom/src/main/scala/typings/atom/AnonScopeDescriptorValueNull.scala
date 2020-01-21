package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorValueNull extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Null
}

object AnonScopeDescriptorValueNull {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String = null): AnonScopeDescriptorValueNull = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeDescriptorValueNull]
  }
}

