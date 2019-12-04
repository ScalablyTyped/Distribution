package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CursorScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Word | Cursor
}

object Anon_CursorScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Word | Cursor): Anon_CursorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CursorScopeDescriptor]
  }
}

