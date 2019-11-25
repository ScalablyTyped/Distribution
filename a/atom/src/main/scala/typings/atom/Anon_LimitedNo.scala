package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.limited
import typings.atom.atomStrings.no
import typings.atom.atomStrings.undecided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LimitedNo extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: limited | no | undecided
}

object Anon_LimitedNo {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: limited | no | undecided): Anon_LimitedNo = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LimitedNo]
  }
}

