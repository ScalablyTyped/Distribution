package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPermissionsRequestEntry extends js.Object {
  /**
    * A unique identifier for the batch permissions request entry.
    */
  var Id: Identifier
  /**
    * The permissions to be granted.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  /**
    * Indicates if the option to pass permissions is granted.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
  /**
    * The principal to be granted a permission.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
  /**
    * The resource to which the principal is to be granted a permission.
    */
  var Resource: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.Resource] = js.undefined
}

object BatchPermissionsRequestEntry {
  @scala.inline
  def apply(
    Id: Identifier,
    Permissions: PermissionList = null,
    PermissionsWithGrantOption: PermissionList = null,
    Principal: DataLakePrincipal = null,
    Resource: Resource = null
  ): BatchPermissionsRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption)
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    if (Resource != null) __obj.updateDynamic("Resource")(Resource)
    __obj.asInstanceOf[BatchPermissionsRequestEntry]
  }
}

