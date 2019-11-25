package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptorValueNumber extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Double
}

object Anon_ScopeDescriptorValueNumber {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Double): Anon_ScopeDescriptorValueNumber = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ScopeDescriptorValueNumber]
  }
}

