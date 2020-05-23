package typings.atom.anon

import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `22` extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: Subsequence | Symbol
}

object `22` {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Subsequence | Symbol): `22` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
}

