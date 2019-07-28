package typings.angularDashPermission.angularMod.permissionNs

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
    validationFunction: RoleValidationFunction = null
  ): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames, roleName = roleName, validateRole = js.Any.fromFunction0(validateRole))
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(validationFunction)
    __obj.asInstanceOf[Role]
  }
}

