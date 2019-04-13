package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFleetActionsInput extends js.Object {
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList
  /**
    * Unique identifier for a fleet
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
}

object StartFleetActionsInput {
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetId): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions, FleetId = FleetId)
  
    __obj.asInstanceOf[StartFleetActionsInput]
  }
}

