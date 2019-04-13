package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetUtilization extends js.Object {
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
  /**
    * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
}

object FleetUtilization {
  @scala.inline
  def apply(
    ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined,
    CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    FleetId: FleetId = null,
    MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  ): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActiveGameSessionCount)) __obj.updateDynamic("ActiveGameSessionCount")(ActiveGameSessionCount)
    if (!js.isUndefined(ActiveServerProcessCount)) __obj.updateDynamic("ActiveServerProcessCount")(ActiveServerProcessCount)
    if (!js.isUndefined(CurrentPlayerSessionCount)) __obj.updateDynamic("CurrentPlayerSessionCount")(CurrentPlayerSessionCount)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (!js.isUndefined(MaximumPlayerSessionCount)) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount)
    __obj.asInstanceOf[FleetUtilization]
  }
}

