package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionScope extends js.Object {
  var scope: String
}

object PermissionScope {
  @scala.inline
  def apply(scope: String): PermissionScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionScope]
  }
}

