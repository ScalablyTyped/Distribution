package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcEndpointConnectionNotificationsRequest extends js.Object {
  /**
    * One or more notification IDs.
    */
  var ConnectionNotificationIds: ValueStringList
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object DeleteVpcEndpointConnectionNotificationsRequest {
  @scala.inline
  def apply(ConnectionNotificationIds: ValueStringList, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpcEndpointConnectionNotificationsRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationIds = ConnectionNotificationIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteVpcEndpointConnectionNotificationsRequest]
  }
}

