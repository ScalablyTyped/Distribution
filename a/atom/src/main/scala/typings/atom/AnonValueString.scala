package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

