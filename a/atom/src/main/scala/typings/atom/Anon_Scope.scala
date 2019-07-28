package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  var scope: js.Array[String] | ScopeDescriptor
}

object Anon_Scope {
  @scala.inline
  def apply(scope: js.Array[String] | ScopeDescriptor): Anon_Scope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Scope]
  }
}

