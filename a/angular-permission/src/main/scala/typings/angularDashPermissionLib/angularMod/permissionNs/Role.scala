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

