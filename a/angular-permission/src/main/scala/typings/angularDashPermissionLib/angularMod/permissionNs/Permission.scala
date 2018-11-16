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

