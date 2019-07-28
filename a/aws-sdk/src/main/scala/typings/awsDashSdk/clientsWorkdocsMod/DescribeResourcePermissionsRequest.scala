package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The ID of the principal to filter permissions by.
    */
  var PrincipalId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object DescribeResourcePermissionsRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null,
    PrincipalId: IdType = null
  ): DescribeResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    __obj.asInstanceOf[DescribeResourcePermissionsRequest]
  }
}

