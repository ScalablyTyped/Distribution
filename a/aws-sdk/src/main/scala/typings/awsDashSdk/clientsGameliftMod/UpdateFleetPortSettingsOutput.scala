package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetPortSettingsOutput extends js.Object {
  /**
    * Unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
}

object UpdateFleetPortSettingsOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): UpdateFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
  }
}

