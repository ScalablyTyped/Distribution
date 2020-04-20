package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Null
}

object Anon17 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String = null): Anon17 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon17]
  }
}

