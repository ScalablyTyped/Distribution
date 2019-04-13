package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var permissionNames: js.Array[java.lang.String]
  var roleName: java.lang.String
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.undefined
  def validateRole(): angularLib.angularMod.IPromise[_]
}

object Role {
  @scala.inline
  def apply(
    permissionNames: js.Array[java.lang.String],
    roleName: java.lang.String,
    validateRole: () => angularLib.angularMod.IPromise[_],
    validationFunction: RoleValidationFunction = null
  ): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames, roleName = roleName, validateRole = js.Any.fromFunction0(validateRole))
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(validationFunction)
    __obj.asInstanceOf[Role]
  }
}

