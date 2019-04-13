package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMaintenanceWindowRequest extends js.Object {
  /**
    * Enables a Maintenance Window task to run on managed instances, even if you have not registered those instances as targets. If enabled, then you must specify the unregistered instances (by instance ID) when you register a task with the Maintenance Window  If you don't enable this option, then you must specify previously-registered targets when you register a task with the Maintenance Window. 
    */
  var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: MaintenanceWindowCutoff
  /**
    * An optional description for the Maintenance Window. We recommend specifying a description to help you organize your Maintenance Windows. 
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The duration of the Maintenance Window in hours.
    */
  var Duration: MaintenanceWindowDurationHours
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the Maintenance Window to become inactive. EndDate allows you to set a date and time in the future when the Maintenance Window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * The name of the Maintenance Window.
    */
  var Name: MaintenanceWindowName
  /**
    * The schedule of the Maintenance Window in the form of a cron or rate expression.
    */
  var Schedule: MaintenanceWindowSchedule
  /**
    * The time zone that the scheduled Maintenance Window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the Maintenance Window to become active. StartDate allows you to delay activation of the Maintenance Window until the specified future date.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a Maintenance Window to identify the type of tasks it will run, the types of targets, and the environment it will run in. In this case, you could specify the following key name/value pairs:    Key=TaskType,Value=AgentUpdate     Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing Maintenance Window, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateMaintenanceWindowRequest {
  @scala.inline
  def apply(
    AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets,
    Cutoff: MaintenanceWindowCutoff,
    Duration: MaintenanceWindowDurationHours,
    Name: MaintenanceWindowName,
    Schedule: MaintenanceWindowSchedule,
    ClientToken: ClientToken = null,
    Description: MaintenanceWindowDescription = null,
    EndDate: MaintenanceWindowStringDateTime = null,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    Tags: TagList = null
  ): CreateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(AllowUnassociatedTargets = AllowUnassociatedTargets, Cutoff = Cutoff, Duration = Duration, Name = Name, Schedule = Schedule)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateMaintenanceWindowRequest]
  }
}

