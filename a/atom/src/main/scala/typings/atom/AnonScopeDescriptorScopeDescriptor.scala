package typings.atom

import typings.atom.mod.FileEncoding
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: FileEncoding
}

object AnonScopeDescriptorScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: FileEncoding): AnonScopeDescriptorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorScopeDescriptor]
  }
}

