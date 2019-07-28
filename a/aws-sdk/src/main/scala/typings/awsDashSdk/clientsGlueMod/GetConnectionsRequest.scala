package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionsRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * A filter that controls which connections will be returned.
    */
  var Filter: js.UndefOr[GetConnectionsFilter] = js.undefined
  /**
    * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the rest of the connection properties.
    */
  var HidePassword: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of connections to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetConnectionsRequest {
  @scala.inline
  def apply(
    CatalogId: CatalogIdString = null,
    Filter: GetConnectionsFilter = null,
    HidePassword: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: Token = null
  ): GetConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(HidePassword)) __obj.updateDynamic("HidePassword")(HidePassword)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetConnectionsRequest]
  }
}

