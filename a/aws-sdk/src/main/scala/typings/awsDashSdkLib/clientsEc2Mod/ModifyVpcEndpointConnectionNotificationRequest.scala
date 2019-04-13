package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * One or more events for the endpoint. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ARN for the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object ModifyVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(
    ConnectionNotificationId: String,
    ConnectionEvents: ValueStringList = null,
    ConnectionNotificationArn: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationId = ConnectionNotificationId)
    if (ConnectionEvents != null) __obj.updateDynamic("ConnectionEvents")(ConnectionEvents)
    if (ConnectionNotificationArn != null) __obj.updateDynamic("ConnectionNotificationArn")(ConnectionNotificationArn)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
  }
}

