package typings.atom.anon

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `21` extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: Word | Cursor
}

object `21` {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Word | Cursor): `21` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
}

