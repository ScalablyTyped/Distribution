package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var permissionName: java.lang.String
  var validationFunction: js.UndefOr[PermissionValidationFunction] = js.undefined
  def validatePermission(): angularLib.angularMod.angularNs.IPromise[_]
}

object Permission {
  @scala.inline
  def apply(
    permissionName: java.lang.String,
    validatePermission: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    validationFunction: PermissionValidationFunction = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("permissionName")(permissionName)
    __obj.updateDynamic("validatePermission")(validatePermission)
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(validationFunction)
    __obj.asInstanceOf[Permission]
  }
}

