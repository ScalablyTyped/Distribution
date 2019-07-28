package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetModifyConfig extends js.Object {
  /**
    * A unique identifier for the instance fleet.
    */
  var InstanceFleetId: typings.awsDashSdk.clientsEmrMod.InstanceFleetId
  /**
    * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}

object InstanceFleetModifyConfig {
  @scala.inline
  def apply(
    InstanceFleetId: InstanceFleetId,
    TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
    TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  ): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId)
    if (!js.isUndefined(TargetOnDemandCapacity)) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity)
    if (!js.isUndefined(TargetSpotCapacity)) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity)
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
}

