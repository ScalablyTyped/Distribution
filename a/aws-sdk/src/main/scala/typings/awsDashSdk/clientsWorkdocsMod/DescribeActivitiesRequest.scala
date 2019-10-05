package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivitiesRequest extends js.Object {
  /**
    * Specifies which activity types to include in the response. If this field is left empty, all activity types are returned.
    */
  var ActivityTypes: js.UndefOr[ActivityNamesFilterType] = js.undefined
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The timestamp that determines the end time of the activities. The response includes the activities performed before the specified timestamp.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * Includes indirect activities. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IncludeIndirectActivities: js.UndefOr[BooleanType] = js.undefined
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  /**
    * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * The document or folder ID for which to describe activity types.
    */
  var ResourceId: js.UndefOr[IdType] = js.undefined
  /**
    * The timestamp that determines the starting time of the activities. The response includes the activities performed after the specified timestamp.
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an optional parameter and is only applicable for administrative API (SigV4) requests.
    */
  var UserId: js.UndefOr[IdType] = js.undefined
}

object DescribeActivitiesRequest {
  @scala.inline
  def apply(
    ActivityTypes: ActivityNamesFilterType = null,
    AuthenticationToken: AuthenticationHeaderType = null,
    EndTime: TimestampType = null,
    IncludeIndirectActivities: js.UndefOr[Boolean] = js.undefined,
    Limit: Int | Double = null,
    Marker: MarkerType = null,
    OrganizationId: IdType = null,
    ResourceId: IdType = null,
    StartTime: TimestampType = null,
    UserId: IdType = null
  ): DescribeActivitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (ActivityTypes != null) __obj.updateDynamic("ActivityTypes")(ActivityTypes)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(IncludeIndirectActivities)) __obj.updateDynamic("IncludeIndirectActivities")(IncludeIndirectActivities)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[DescribeActivitiesRequest]
  }
}

