package typings.atom

import typings.atom.atomMod.FileEncoding
import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueFileEncoding extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: FileEncoding
}

object Anon_ScopeDescriptorValueFileEncoding {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: FileEncoding): Anon_ScopeDescriptorValueFileEncoding = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ScopeDescriptorValueFileEncoding]
  }
}

