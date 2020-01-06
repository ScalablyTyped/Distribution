package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalResourcePermissions extends js.Object {
  /**
    * The permissions to be granted or revoked on the resource.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  /**
    * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The Data Lake principal to be granted or revoked permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  /**
    * The resource where permissions are to be granted or revoked.
    */
  var Resource: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.Resource] = js.native
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
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalResourcePermissions]
  }
}

