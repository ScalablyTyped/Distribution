package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcEndpointConnectionNotificationRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * One or more endpoint events for which to receive notifications. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: ValueStringList
  /**
    * The ARN of the SNS topic for the notifications.
    */
  var ConnectionNotificationArn: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the endpoint. 
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
}

object CreateVpcEndpointConnectionNotificationRequest {
  @scala.inline
  def apply(
    ConnectionEvents: ValueStringList,
    ConnectionNotificationArn: String,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ServiceId: String = null,
    VpcEndpointId: String = null
  ): CreateVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionEvents = ConnectionEvents, ConnectionNotificationArn = ConnectionNotificationArn)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId)
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId)
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
  }
}

