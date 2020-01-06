package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActionStartSettings extends js.Object {
  /**
    * Option for specifying the start time for an action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FixedModeScheduleActionStartSettings] = js.native
  /**
    * Option for specifying an action as relative to another action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FollowModeScheduleActionStartSettings] = js.native
  /**
    * Option for specifying an action that should be applied immediately.
    */
  var ImmediateModeScheduleActionStartSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.ImmediateModeScheduleActionStartSettings] = js.native
}

object ScheduleActionStartSettings {
  @scala.inline
  def apply(
    FixedModeScheduleActionStartSettings: FixedModeScheduleActionStartSettings = null,
    FollowModeScheduleActionStartSettings: FollowModeScheduleActionStartSettings = null,
    ImmediateModeScheduleActionStartSettings: ImmediateModeScheduleActionStartSettings = null
  ): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    if (FixedModeScheduleActionStartSettings != null) __obj.updateDynamic("FixedModeScheduleActionStartSettings")(FixedModeScheduleActionStartSettings.asInstanceOf[js.Any])
    if (FollowModeScheduleActionStartSettings != null) __obj.updateDynamic("FollowModeScheduleActionStartSettings")(FollowModeScheduleActionStartSettings.asInstanceOf[js.Any])
    if (ImmediateModeScheduleActionStartSettings != null) __obj.updateDynamic("ImmediateModeScheduleActionStartSettings")(ImmediateModeScheduleActionStartSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
}

