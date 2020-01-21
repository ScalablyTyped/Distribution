package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScope extends js.Object {
  var scope: js.Array[String] | ScopeDescriptor
}

object AnonScope {
  @scala.inline
  def apply(scope: js.Array[String] | ScopeDescriptor): AnonScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScope]
  }
}

