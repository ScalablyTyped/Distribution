package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var scope: js.Array[String] | typings.atom.mod.ScopeDescriptor
}

object Scope {
  @scala.inline
  def apply(scope: js.Array[String] | typings.atom.mod.ScopeDescriptor): Scope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

