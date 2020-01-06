package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointConnectionNotificationsRequest extends js.Object {
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    connection-notification-arn - The ARN of SNS topic for the notification.    connection-notification-id - The ID of the notification.    connection-notification-state - The state of the notification (Enabled | Disabled).    connection-notification-type - The type of notification (Topic).    service-id - The ID of the endpoint service.    vpc-endpoint-id - The ID of the VPC endpoint.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeVpcEndpointConnectionNotificationsRequest {
  @scala.inline
  def apply(
    ConnectionNotificationId: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeVpcEndpointConnectionNotificationsRequest = {
    val __obj = js.Dynamic.literal()
    if (ConnectionNotificationId != null) __obj.updateDynamic("ConnectionNotificationId")(ConnectionNotificationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsRequest]
  }
}

