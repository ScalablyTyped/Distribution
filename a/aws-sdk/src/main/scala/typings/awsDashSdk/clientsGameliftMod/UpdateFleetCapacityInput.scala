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
    DesiredInstances: Int | scala.Double = null,
    MaxSize: Int | scala.Double = null,
    MinSize: Int | scala.Double = null
  ): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (DesiredInstances != null) __obj.updateDynamic("DesiredInstances")(DesiredInstances.asInstanceOf[js.Any])
    if (MaxSize != null) __obj.updateDynamic("MaxSize")(MaxSize.asInstanceOf[js.Any])
    if (MinSize != null) __obj.updateDynamic("MinSize")(MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
}

