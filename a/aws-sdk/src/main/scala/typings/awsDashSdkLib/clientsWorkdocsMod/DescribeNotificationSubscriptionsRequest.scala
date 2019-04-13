package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationSubscriptionsRequest extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType
}

object DescribeNotificationSubscriptionsRequest {
  @scala.inline
  def apply(OrganizationId: IdType, Limit: js.UndefOr[LimitType] = js.undefined, Marker: PageMarkerType = null): DescribeNotificationSubscriptionsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeNotificationSubscriptionsRequest]
  }
}

