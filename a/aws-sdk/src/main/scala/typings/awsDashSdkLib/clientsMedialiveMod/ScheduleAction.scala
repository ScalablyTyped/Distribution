package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleAction extends js.Object {
  /**
    * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
    */
  var ActionName: __string
  /**
    * Settings for this schedule action.
    */
  var ScheduleActionSettings: awsDashSdkLib.clientsMedialiveMod.ScheduleActionSettings
  /**
    * The time for the action to start in the channel.
    */
  var ScheduleActionStartSettings: awsDashSdkLib.clientsMedialiveMod.ScheduleActionStartSettings
}

object ScheduleAction {
  @scala.inline
  def apply(
    ActionName: __string,
    ScheduleActionSettings: ScheduleActionSettings,
    ScheduleActionStartSettings: ScheduleActionStartSettings
  ): ScheduleAction = {
    val __obj = js.Dynamic.literal(ActionName = ActionName, ScheduleActionSettings = ScheduleActionSettings, ScheduleActionStartSettings = ScheduleActionStartSettings)
  
    __obj.asInstanceOf[ScheduleAction]
  }
}

