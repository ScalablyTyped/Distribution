package typings.atom

import typings.atom.atomStrings.Bottom
import typings.atom.atomStrings.Left
import typings.atom.atomStrings.Right
import typings.atom.atomStrings.Top
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon25 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Top | Right | Bottom | Left
}

object Anon25 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Top | Right | Bottom | Left): Anon25 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon25]
  }
}

