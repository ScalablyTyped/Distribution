package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetCapacityInput extends js.Object {
  /**
    * Number of EC2 instances you want this fleet to host.
    */
  var DesiredInstances: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Unique identifier for a fleet to update capacity for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
  /**
    * Maximum value allowed for the fleet's instance count. Default if not set is 1.
    */
  var MaxSize: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Minimum value allowed for the fleet's instance count. Default if not set is 0.
    */
  var MinSize: js.UndefOr[WholeNumber] = js.undefined
}

object UpdateFleetCapacityInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    DesiredInstances: js.UndefOr[WholeNumber] = js.undefined,
    MaxSize: js.UndefOr[WholeNumber] = js.undefined,
    MinSize: js.UndefOr[WholeNumber] = js.undefined
  ): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (!js.isUndefined(DesiredInstances)) __obj.updateDynamic("DesiredInstances")(DesiredInstances)
    if (!js.isUndefined(MaxSize)) __obj.updateDynamic("MaxSize")(MaxSize)
    if (!js.isUndefined(MinSize)) __obj.updateDynamic("MinSize")(MinSize)
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
}

