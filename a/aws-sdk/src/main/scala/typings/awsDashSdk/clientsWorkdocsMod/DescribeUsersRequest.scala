package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUsersRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization information.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  /**
    * The state of the users. Specify "ALL" to include inactive users.
    */
  var Include: js.UndefOr[UserFilterType] = js.undefined
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The order for the results.
    */
  var Order: js.UndefOr[OrderType] = js.undefined
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * A query to filter users by user name.
    */
  var Query: js.UndefOr[SearchQueryType] = js.undefined
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[UserSortType] = js.undefined
  /**
    * The IDs of the users.
    */
  var UserIds: js.UndefOr[UserIdsType] = js.undefined
}

object DescribeUsersRequest {
  @scala.inline
  def apply(
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Include: UserFilterType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null,
    Order: OrderType = null,
    OrganizationId: IdType = null,
    Query: SearchQueryType = null,
    Sort: UserSortType = null,
    UserIds: UserIdsType = null
  ): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Fields != null) __obj.updateDynamic("Fields")(Fields)
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (Query != null) __obj.updateDynamic("Query")(Query)
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds)
    __obj.asInstanceOf[DescribeUsersRequest]
  }
}

