package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueString extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String
}

object Anon_ScopeDescriptorValueString {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String): Anon_ScopeDescriptorValueString = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor, value = value)
  
    __obj.asInstanceOf[Anon_ScopeDescriptorValueString]
  }
}

