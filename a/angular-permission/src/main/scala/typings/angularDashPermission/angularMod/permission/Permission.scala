package typings.angularDashPermission.angularMod.permission

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
    validationFunction: (/* permissionName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any] = null
  ): Permission = {
    val __obj = js.Dynamic.literal(permissionName = permissionName, validatePermission = js.Any.fromFunction0(validatePermission))
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(js.Any.fromFunction2(validationFunction))
    __obj.asInstanceOf[Permission]
  }
}

