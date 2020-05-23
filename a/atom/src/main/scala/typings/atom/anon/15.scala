package typings.atom.anon

import typings.atom.atomStrings.atom
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `15` extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: native | experimental | poll | atom
}

object `15` {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: native | experimental | poll | atom): `15` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
}

