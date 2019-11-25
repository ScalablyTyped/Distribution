package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysNo extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: no | yes | always
}

object Anon_AlwaysNo {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): Anon_AlwaysNo = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlwaysNo]
  }
}

