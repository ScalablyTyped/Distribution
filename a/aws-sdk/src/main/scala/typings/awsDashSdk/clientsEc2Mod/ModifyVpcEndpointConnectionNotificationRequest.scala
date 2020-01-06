package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * One or more events for the endpoint. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  /**
    * The ARN for the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: typings.awsDashSdk.clientsEc2Mod.ConnectionNotificationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object ModifyVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(
    ConnectionNotificationId: ConnectionNotificationId,
    ConnectionEvents: ValueStringList = null,
    ConnectionNotificationArn: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationId = ConnectionNotificationId.asInstanceOf[js.Any])
    if (ConnectionEvents != null) __obj.updateDynamic("ConnectionEvents")(ConnectionEvents.asInstanceOf[js.Any])
    if (ConnectionNotificationArn != null) __obj.updateDynamic("ConnectionNotificationArn")(ConnectionNotificationArn.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
  }
}

