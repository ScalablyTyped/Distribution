package typings.angularDashPermission.angularMod.permission

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var permissionNames: js.Array[String]
  var roleName: String
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.undefined
  def validateRole(): IPromise[_]
}

object Role {
  @scala.inline
  def apply(
    permissionNames: js.Array[String],
    roleName: String,
    validateRole: () => IPromise[_],
    validationFunction: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any] = null
  ): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], validateRole = js.Any.fromFunction0(validateRole))
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(js.Any.fromFunction2(validationFunction))
    __obj.asInstanceOf[Role]
  }
}

