package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Boolean
}

object AnonValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Boolean): AnonValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

