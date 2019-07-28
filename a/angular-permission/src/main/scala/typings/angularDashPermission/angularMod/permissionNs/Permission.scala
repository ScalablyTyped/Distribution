package typings.angularDashPermission.angularMod.permissionNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var permissionName: String
  var validationFunction: js.UndefOr[PermissionValidationFunction] = js.undefined
  def validatePermission(): IPromise[_]
}

object Permission {
  @scala.inline
  def apply(
    permissionName: String,
    validatePermission: () => IPromise[_],
    validationFunction: PermissionValidationFunction = null
  ): Permission = {
    val __obj = js.Dynamic.literal(permissionName = permissionName, validatePermission = js.Any.fromFunction0(validatePermission))
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(validationFunction)
    __obj.asInstanceOf[Permission]
  }
}

