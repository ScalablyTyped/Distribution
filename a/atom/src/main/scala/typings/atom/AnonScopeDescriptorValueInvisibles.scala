package typings.atom

import typings.atom.mod.Invisibles
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorValueInvisibles extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Invisibles
}

object AnonScopeDescriptorValueInvisibles {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Invisibles): AnonScopeDescriptorValueInvisibles = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorValueInvisibles]
  }
}

