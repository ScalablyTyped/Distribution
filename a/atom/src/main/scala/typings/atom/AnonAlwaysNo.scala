package typings.atom

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlwaysNo extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: no | yes | always
}

object AnonAlwaysNo {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): AnonAlwaysNo = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlwaysNo]
  }
}

