package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance IDs.
    */
  var InstanceIds: InstanceIdStringList
}

object RebootInstancesRequest {
  @scala.inline
  def apply(InstanceIds: InstanceIdStringList, DryRun: js.UndefOr[Boolean] = js.undefined): RebootInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[RebootInstancesRequest]
  }
}

