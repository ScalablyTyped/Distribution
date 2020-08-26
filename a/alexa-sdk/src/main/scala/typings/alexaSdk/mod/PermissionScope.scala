package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionScope extends js.Object {
  var scope: String = js.native
}

object PermissionScope {
  @scala.inline
  def apply(scope: String): PermissionScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionScope]
  }
  @scala.inline
  implicit class PermissionScopeOps[Self <: PermissionScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

