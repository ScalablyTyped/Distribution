package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the instances. Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
    */
  var InstanceIds: InstanceIdStringList
}

object TerminateInstancesRequest {
  @scala.inline
  def apply(InstanceIds: InstanceIdStringList, DryRun: js.UndefOr[Boolean] = js.undefined): TerminateInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[TerminateInstancesRequest]
  }
}

