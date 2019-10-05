package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptReservedInstancesExchangeQuoteRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the Convertible Reserved Instances to exchange for another Convertible Reserved Instance of the same or higher value.
    */
  var ReservedInstanceIds: ReservedInstanceIdSet
  /**
    * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
    */
  var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined
}

object AcceptReservedInstancesExchangeQuoteRequest {
  @scala.inline
  def apply(
    ReservedInstanceIds: ReservedInstanceIdSet,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TargetConfigurations: TargetConfigurationRequestSet = null
  ): AcceptReservedInstancesExchangeQuoteRequest = {
    val __obj = js.Dynamic.literal(ReservedInstanceIds = ReservedInstanceIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (TargetConfigurations != null) __obj.updateDynamic("TargetConfigurations")(TargetConfigurations)
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteRequest]
  }
}

