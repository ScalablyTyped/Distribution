package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectivePermissionsForPathRequest extends js.Object {
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
    * The Amazon Resource Name (ARN) of the resource for which you want to get permissions.
    */
  var ResourceArn: ResourceArnString
}

object GetEffectivePermissionsForPathRequest {
  @scala.inline
  def apply(
    ResourceArn: ResourceArnString,
    CatalogId: CatalogIdString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: Token = null
  ): GetEffectivePermissionsForPathRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetEffectivePermissionsForPathRequest]
  }
}

