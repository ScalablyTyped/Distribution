package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGroupsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[PositiveIntegerType] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  /**
    * A query to describe groups by group name.
    */
  var SearchQuery: SearchQueryType = js.native
}

object DescribeGroupsRequest {
  @scala.inline
  def apply(
    SearchQuery: SearchQueryType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Limit: Int | Double = null,
    Marker: MarkerType = null,
    OrganizationId: IdType = null
  ): DescribeGroupsRequest = {
    val __obj = js.Dynamic.literal(SearchQuery = SearchQuery.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupsRequest]
  }
}

