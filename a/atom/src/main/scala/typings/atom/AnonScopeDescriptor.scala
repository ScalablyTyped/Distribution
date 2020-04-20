package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: js.Array[String]
}

object AnonScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: js.Array[String]): AnonScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeDescriptor]
  }
}

