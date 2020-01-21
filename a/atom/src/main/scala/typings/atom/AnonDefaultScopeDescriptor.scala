package typings.atom

import typings.atom.atomStrings.default
import typings.atom.atomStrings.srgb
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: default | srgb
}

object AnonDefaultScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: default | srgb): AnonDefaultScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultScopeDescriptor]
  }
}

