package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePage extends Page {
  var roles: js.Array[Role] = js.native
}

object RolePage {
  @scala.inline
  def apply(length: Double, limit: Double, roles: js.Array[Role], start: Double, total: Double): RolePage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePage]
  }
  @scala.inline
  implicit class RolePageOps[Self <: RolePage] (val x: Self) extends AnyVal {
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
    def setRolesVarargs(value: Role*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[Role]): Self = this.set("roles", value.asInstanceOf[js.Any])
  }
  
}

