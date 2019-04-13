package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetCapacityOutput extends js.Object {
  /**
    * Unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
}

object UpdateFleetCapacityOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): UpdateFleetCapacityOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[UpdateFleetCapacityOutput]
  }
}

