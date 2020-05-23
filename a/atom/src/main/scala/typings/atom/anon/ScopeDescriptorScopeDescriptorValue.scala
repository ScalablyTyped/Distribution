package typings.atom.anon

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptorScopeDescriptorValue extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: no | yes | always
}

object ScopeDescriptorScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: no | yes | always): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
}

