package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueNumberString extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Double
}

object Anon_ScopeDescriptorValueNumberString {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String | Double): Anon_ScopeDescriptorValueNumberString = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ScopeDescriptorValueNumberString]
  }
}

