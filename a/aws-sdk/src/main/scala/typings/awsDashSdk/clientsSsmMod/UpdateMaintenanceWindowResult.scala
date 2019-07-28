package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowResult extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
  /**
    * An optional description of the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
  /**
    * Whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The ID of the created maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object UpdateMaintenanceWindowResult {
  @scala.inline
  def apply(
    AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
    Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
    Description: MaintenanceWindowDescription = null,
    Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
    Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
    EndDate: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    Schedule: MaintenanceWindowSchedule = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    WindowId: MaintenanceWindowId = null
  ): UpdateMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUnassociatedTargets)) __obj.updateDynamic("AllowUnassociatedTargets")(AllowUnassociatedTargets)
    if (!js.isUndefined(Cutoff)) __obj.updateDynamic("Cutoff")(Cutoff)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[UpdateMaintenanceWindowResult]
  }
}

