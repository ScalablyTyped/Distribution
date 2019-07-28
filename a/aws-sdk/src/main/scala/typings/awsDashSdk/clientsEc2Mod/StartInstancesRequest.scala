package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartInstancesRequest extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList
}

object StartInstancesRequest {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdStringList,
    AdditionalInfo: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): StartInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds)
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[StartInstancesRequest]
  }
}

