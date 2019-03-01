package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWithPermissions extends js.Object {
  var permissions: js.UndefOr[angularDashPermissionLib.Anon_Except] = js.undefined
}

object DataWithPermissions {
  @scala.inline
  def apply(permissions: angularDashPermissionLib.Anon_Except = null): DataWithPermissions = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[DataWithPermissions]
  }
}

