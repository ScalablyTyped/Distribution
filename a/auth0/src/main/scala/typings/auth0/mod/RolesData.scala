package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolesData extends js.Object {
  var roles: js.Array[String] = js.native
}

object RolesData {
  @scala.inline
  def apply(roles: js.Array[String]): RolesData = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolesData]
  }
  @scala.inline
  implicit class RolesDataOps[Self <: RolesData] (val x: Self) extends AnyVal {
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
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
  }
  
}

