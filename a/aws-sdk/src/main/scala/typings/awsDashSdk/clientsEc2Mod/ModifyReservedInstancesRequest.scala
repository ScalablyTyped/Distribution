package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReservedInstancesRequest extends js.Object {
  /**
    * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the Reserved Instances to modify.
    */
  var ReservedInstancesIds: ReservedInstancesIdStringList
  /**
    * The configuration settings for the Reserved Instances to modify.
    */
  var TargetConfigurations: ReservedInstancesConfigurationList
}

object ModifyReservedInstancesRequest {
  @scala.inline
  def apply(
    ReservedInstancesIds: ReservedInstancesIdStringList,
    TargetConfigurations: ReservedInstancesConfigurationList,
    ClientToken: String = null
  ): ModifyReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds, TargetConfigurations = TargetConfigurations)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    __obj.asInstanceOf[ModifyReservedInstancesRequest]
  }
}

