package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleActionStartSettings extends js.Object {
  /**
    * Holds the start time for the action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings] = js.undefined
  /**
    * Specifies an action to follow for scheduling this action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings] = js.undefined
}

object ScheduleActionStartSettings {
  @scala.inline
  def apply(
    FixedModeScheduleActionStartSettings: FixedModeScheduleActionStartSettings = null,
    FollowModeScheduleActionStartSettings: FollowModeScheduleActionStartSettings = null
  ): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    if (FixedModeScheduleActionStartSettings != null) __obj.updateDynamic("FixedModeScheduleActionStartSettings")(FixedModeScheduleActionStartSettings)
    if (FollowModeScheduleActionStartSettings != null) __obj.updateDynamic("FollowModeScheduleActionStartSettings")(FollowModeScheduleActionStartSettings)
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
}

