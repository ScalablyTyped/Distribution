package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteFleetError] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
}

object DeleteFleetErrorItem {
  @scala.inline
  def apply(Error: DeleteFleetError = null, FleetId: FleetIdentifier = null): DeleteFleetErrorItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[DeleteFleetErrorItem]
  }
}

