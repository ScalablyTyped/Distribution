package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * Specifies a principal to filter the permissions returned.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
  /**
    * A resource where you will get a list of the principal permissions. This operation does not support getting privileges on a table with columns. Instead, call this operation on the table, and the operation returns the table and the table w columns.
    */
  var Resource: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.Resource] = js.undefined
  /**
    * Specifies a resource type to filter the permissions returned.
    */
  var ResourceType: js.UndefOr[DataLakeResourceType] = js.undefined
}

object ListPermissionsRequest {
  @scala.inline
  def apply(
    CatalogId: CatalogIdString = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null,
    Principal: DataLakePrincipal = null,
    Resource: Resource = null,
    ResourceType: DataLakeResourceType = null
  ): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    if (Resource != null) __obj.updateDynamic("Resource")(Resource)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsRequest]
  }
}

