package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList
}

object MonitorInstancesRequest {
  @scala.inline
  def apply(InstanceIds: InstanceIdStringList, DryRun: js.UndefOr[Boolean] = js.undefined): MonitorInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[MonitorInstancesRequest]
  }
}

