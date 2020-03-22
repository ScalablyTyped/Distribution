package typings.atom

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Word | Cursor
}

object Anon19 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Word | Cursor): Anon19 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon19]
  }
}

