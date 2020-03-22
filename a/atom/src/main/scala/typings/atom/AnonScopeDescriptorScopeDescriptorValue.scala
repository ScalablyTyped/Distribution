package typings.atom

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorScopeDescriptorValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: no | yes | always
}

object AnonScopeDescriptorScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): AnonScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorScopeDescriptorValue]
  }
}

