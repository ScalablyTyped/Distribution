package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetUtilization extends js.Object {
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
  /**
    * The maximum number of players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
}

object FleetUtilization {
  @scala.inline
  def apply(
    ActiveGameSessionCount: Int | scala.Double = null,
    ActiveServerProcessCount: Int | scala.Double = null,
    CurrentPlayerSessionCount: Int | scala.Double = null,
    FleetId: FleetId = null,
    MaximumPlayerSessionCount: Int | scala.Double = null
  ): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    if (ActiveGameSessionCount != null) __obj.updateDynamic("ActiveGameSessionCount")(ActiveGameSessionCount.asInstanceOf[js.Any])
    if (ActiveServerProcessCount != null) __obj.updateDynamic("ActiveServerProcessCount")(ActiveServerProcessCount.asInstanceOf[js.Any])
    if (CurrentPlayerSessionCount != null) __obj.updateDynamic("CurrentPlayerSessionCount")(CurrentPlayerSessionCount.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (MaximumPlayerSessionCount != null) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetUtilization]
  }
}

