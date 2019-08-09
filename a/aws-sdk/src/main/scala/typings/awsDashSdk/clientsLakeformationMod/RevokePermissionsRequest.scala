package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokePermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The permissions revoked to the principal on the resource. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  var Permissions: PermissionList
  /**
    * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions to other principals.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
  /**
    * The principal to be revoked permissions on the resource.
    */
  var Principal: DataLakePrincipal
  /**
    * The resource to which permissions are to be revoked.
    */
  var Resource: typings.awsDashSdk.clientsLakeformationMod.Resource
}

object RevokePermissionsRequest {
  @scala.inline
  def apply(
    Permissions: PermissionList,
    Principal: DataLakePrincipal,
    Resource: Resource,
    CatalogId: CatalogIdString = null,
    PermissionsWithGrantOption: PermissionList = null
  ): RevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions, Principal = Principal, Resource = Resource)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption)
    __obj.asInstanceOf[RevokePermissionsRequest]
  }
}

