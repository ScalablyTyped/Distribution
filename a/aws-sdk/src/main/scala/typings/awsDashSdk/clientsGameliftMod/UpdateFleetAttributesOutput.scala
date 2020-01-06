package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetAttributesOutput extends js.Object {
  /**
    * A unique identifier for a fleet that was updated. Use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
}

object UpdateFleetAttributesOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): UpdateFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetAttributesOutput]
  }
}

