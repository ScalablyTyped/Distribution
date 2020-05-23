package typings.atom.anon

import typings.atom.mod.FileEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptorScopeDescriptor extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: FileEncoding
}

object ScopeDescriptorScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: FileEncoding): ScopeDescriptorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptor]
  }
}

