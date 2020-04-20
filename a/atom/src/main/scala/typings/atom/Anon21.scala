package typings.atom

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Word | Cursor
}

object Anon21 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Word | Cursor): Anon21 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon21]
  }
}

