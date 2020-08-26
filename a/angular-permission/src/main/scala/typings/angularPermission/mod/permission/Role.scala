package typings.angularPermission.mod.permission

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  var permissionNames: js.Array[String] = js.native
  var roleName: String = js.native
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.native
  def validateRole(): IPromise[_] = js.native
}

object Role {
  @scala.inline
  def apply(permissionNames: js.Array[String], roleName: String, validateRole: () => IPromise[_]): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], validateRole = js.Any.fromFunction0(validateRole))
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
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
    def setPermissionNamesVarargs(value: String*): Self = this.set("permissionNames", js.Array(value :_*))
    @scala.inline
    def setPermissionNames(value: js.Array[String]): Self = this.set("permissionNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateRole(value: () => IPromise[_]): Self = this.set("validateRole", js.Any.fromFunction0(value))
    @scala.inline
    def setValidationFunction(
      value: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any]
    ): Self = this.set("validationFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidationFunction: Self = this.set("validationFunction", js.undefined)
  }
  
}

