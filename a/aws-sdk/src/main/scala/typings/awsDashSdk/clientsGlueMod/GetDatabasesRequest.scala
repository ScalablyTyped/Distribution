package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatabasesRequest extends js.Object {
  /**
    * The ID of the Data Catalog from which to retrieve Databases. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The maximum number of databases to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetDatabasesRequest {
  @scala.inline
  def apply(CatalogId: CatalogIdString = null, MaxResults: Int | Double = null, NextToken: Token = null): GetDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDatabasesRequest]
  }
}

