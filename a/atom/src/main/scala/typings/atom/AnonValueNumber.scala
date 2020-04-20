package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueNumber extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Double
}

object AnonValueNumber {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Double): AnonValueNumber = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueNumber]
  }
}

