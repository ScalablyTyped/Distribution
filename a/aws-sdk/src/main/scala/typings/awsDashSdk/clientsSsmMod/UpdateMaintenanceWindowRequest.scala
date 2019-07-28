package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowRequest extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
  /**
    * An optional description for the update request.
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
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. 
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The ID of the maintenance window to update.
    */
  var WindowId: MaintenanceWindowId
}

object UpdateMaintenanceWindowRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined,
    Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined,
    Description: MaintenanceWindowDescription = null,
    Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined,
    Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined,
    EndDate: MaintenanceWindowStringDateTime = null,
    Name: MaintenanceWindowName = null,
    Replace: js.UndefOr[Boolean] = js.undefined,
    Schedule: MaintenanceWindowSchedule = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null
  ): UpdateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId)
    if (!js.isUndefined(AllowUnassociatedTargets)) __obj.updateDynamic("AllowUnassociatedTargets")(AllowUnassociatedTargets)
    if (!js.isUndefined(Cutoff)) __obj.updateDynamic("Cutoff")(Cutoff)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[UpdateMaintenanceWindowRequest]
  }
}

