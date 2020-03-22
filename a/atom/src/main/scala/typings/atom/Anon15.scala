package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon15 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Null
}

object Anon15 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String = null): Anon15 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon15]
  }
}

