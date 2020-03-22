package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: String | Double
}

object Anon16 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: String | Double): Anon16 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon16]
  }
}

