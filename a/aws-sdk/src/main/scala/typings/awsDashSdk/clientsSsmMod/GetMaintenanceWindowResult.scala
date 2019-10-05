package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowResult extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
  /**
    * The date the maintenance window was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
  /**
    * The description of the maintenance window.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
  /**
    * Indicates whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The date the maintenance window was last modified.
    */
  var ModifiedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The next time the maintenance window will actually run, taking into account any specified times for the maintenance window to become active or inactive.
    */
  var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
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

object GetMaintenanceWindowResult {
  @scala.inline
  def apply(
    AllowUnassociatedTargets: js.UndefOr[scala.Boolean] = js.undefined,
    CreatedDate: DateTime = null,
    Cutoff: Int | Double = null,
    Description: MaintenanceWindowDescription = null,
    Duration: Int | Double = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    EndDate: MaintenanceWindowStringDateTime = null,
    ModifiedDate: DateTime = null,
    Name: MaintenanceWindowName = null,
    NextExecutionTime: MaintenanceWindowStringDateTime = null,
    Schedule: MaintenanceWindowSchedule = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    WindowId: MaintenanceWindowId = null
  ): GetMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUnassociatedTargets)) __obj.updateDynamic("AllowUnassociatedTargets")(AllowUnassociatedTargets)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Cutoff != null) __obj.updateDynamic("Cutoff")(Cutoff.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextExecutionTime != null) __obj.updateDynamic("NextExecutionTime")(NextExecutionTime)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[GetMaintenanceWindowResult]
  }
}

