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
    TargetOnDemandCapacity: Int | Double = null,
    TargetSpotCapacity: Int | Double = null
  ): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId)
    if (TargetOnDemandCapacity != null) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity.asInstanceOf[js.Any])
    if (TargetSpotCapacity != null) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
}

