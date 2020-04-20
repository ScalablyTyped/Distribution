package typings.atom

import typings.atom.atomStrings.limited
import typings.atom.atomStrings.no
import typings.atom.atomStrings.undecided
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: limited | no | undecided
}

object Anon14 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: limited | no | undecided): Anon14 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon14]
  }
}

