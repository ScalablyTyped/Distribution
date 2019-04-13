package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopFleetActionsInput extends js.Object {
  /**
    * List of actions to suspend on the fleet. 
    */
  var Actions: FleetActionList
  /**
    * Unique identifier for a fleet
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
}

object StopFleetActionsInput {
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetId): StopFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions, FleetId = FleetId)
  
    __obj.asInstanceOf[StopFleetActionsInput]
  }
}

