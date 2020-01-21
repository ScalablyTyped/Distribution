package typings.atom

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursorScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Word | Cursor
}

object AnonCursorScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Word | Cursor): AnonCursorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCursorScopeDescriptor]
  }
}

