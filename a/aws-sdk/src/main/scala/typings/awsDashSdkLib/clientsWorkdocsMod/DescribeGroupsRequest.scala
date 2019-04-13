package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGroupsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[PositiveIntegerType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * A query to describe groups by group name.
    */
  var SearchQuery: SearchQueryType
}

object DescribeGroupsRequest {
  @scala.inline
  def apply(
    SearchQuery: SearchQueryType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Limit: js.UndefOr[PositiveIntegerType] = js.undefined,
    Marker: MarkerType = null,
    OrganizationId: IdType = null
  ): DescribeGroupsRequest = {
    val __obj = js.Dynamic.literal(SearchQuery = SearchQuery)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    __obj.asInstanceOf[DescribeGroupsRequest]
  }
}

