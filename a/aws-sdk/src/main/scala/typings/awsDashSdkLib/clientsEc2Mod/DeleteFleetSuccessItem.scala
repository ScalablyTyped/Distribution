package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetSuccessItem extends js.Object {
  /**
    * The current state of the EC2 Fleet.
    */
  var CurrentFleetState: js.UndefOr[FleetStateCode] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
  /**
    * The previous state of the EC2 Fleet.
    */
  var PreviousFleetState: js.UndefOr[FleetStateCode] = js.undefined
}

object DeleteFleetSuccessItem {
  @scala.inline
  def apply(
    CurrentFleetState: FleetStateCode = null,
    FleetId: FleetIdentifier = null,
    PreviousFleetState: FleetStateCode = null
  ): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (CurrentFleetState != null) __obj.updateDynamic("CurrentFleetState")(CurrentFleetState.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (PreviousFleetState != null) __obj.updateDynamic("PreviousFleetState")(PreviousFleetState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
}

