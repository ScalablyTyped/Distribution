package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalPermissions extends js.Object {
  /**
    * The permissions that are granted to the principal.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  /**
    * The principal who is granted permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
}

object PrincipalPermissions {
  @scala.inline
  def apply(Permissions: PermissionList = null, Principal: DataLakePrincipal = null): PrincipalPermissions = {
    val __obj = js.Dynamic.literal()
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    __obj.asInstanceOf[PrincipalPermissions]
  }
}

