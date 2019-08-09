package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalResourcePermissions extends js.Object {
  /**
    * The permissions to be granted or revoked on the resource.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  /**
    * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
  /**
    * The Data Lake principal to be granted or revoked permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
  /**
    * The resource where permissions are to be granted or revoked.
    */
  var Resource: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.Resource] = js.undefined
}

object PrincipalResourcePermissions {
  @scala.inline
  def apply(
    Permissions: PermissionList = null,
    PermissionsWithGrantOption: PermissionList = null,
    Principal: DataLakePrincipal = null,
    Resource: Resource = null
  ): PrincipalResourcePermissions = {
    val __obj = js.Dynamic.literal()
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption)
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    if (Resource != null) __obj.updateDynamic("Resource")(Resource)
    __obj.asInstanceOf[PrincipalResourcePermissions]
  }
}

