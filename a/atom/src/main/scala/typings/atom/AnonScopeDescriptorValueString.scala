package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorValueString extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String
}

object AnonScopeDescriptorValueString {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String): AnonScopeDescriptorValueString = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorValueString]
  }
}

