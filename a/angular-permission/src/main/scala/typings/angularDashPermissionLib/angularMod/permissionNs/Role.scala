package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var permissionNames: js.Array[java.lang.String]
  var roleName: java.lang.String
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.undefined
  def validateRole(): angularLib.angularMod.angularNs.IPromise[_]
}

object Role {
  @scala.inline
  def apply(
    permissionNames: js.Array[java.lang.String],
    roleName: java.lang.String,
    validateRole: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    validationFunction: RoleValidationFunction = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("permissionNames")(permissionNames)
    __obj.updateDynamic("roleName")(roleName)
    __obj.updateDynamic("validateRole")(validateRole)
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(validationFunction)
    __obj.asInstanceOf[Role]
  }
}

