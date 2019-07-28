package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunScheduledInstancesRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of instances. Default: 1
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The launch specification. You must match the instance type, Availability Zone, network, and platform of the schedule that you purchased.
    */
  var LaunchSpecification: ScheduledInstancesLaunchSpecification
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: String
}

object RunScheduledInstancesRequest {
  @scala.inline
  def apply(
    LaunchSpecification: ScheduledInstancesLaunchSpecification,
    ScheduledInstanceId: String,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    InstanceCount: js.UndefOr[Integer] = js.undefined
  ): RunScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal(LaunchSpecification = LaunchSpecification, ScheduledInstanceId = ScheduledInstanceId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    __obj.asInstanceOf[RunScheduledInstancesRequest]
  }
}

