package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetAttributesOutput extends js.Object {
  /**
    * Unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
}

object UpdateFleetAttributesOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): UpdateFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[UpdateFleetAttributesOutput]
  }
}

