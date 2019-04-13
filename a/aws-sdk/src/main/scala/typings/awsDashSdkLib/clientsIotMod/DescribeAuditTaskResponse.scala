package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditTaskResponse extends js.Object {
  /**
    * Detailed information about each check performed during this audit.
    */
  var auditDetails: js.UndefOr[AuditDetails] = js.undefined
  /**
    * The name of the scheduled audit (only if the audit was a scheduled audit).
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Statistical information about the audit.
    */
  var taskStatistics: js.UndefOr[TaskStatistics] = js.undefined
  /**
    * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
  /**
    * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.undefined
}

object DescribeAuditTaskResponse {
  @scala.inline
  def apply(
    auditDetails: AuditDetails = null,
    scheduledAuditName: ScheduledAuditName = null,
    taskStartTime: Timestamp = null,
    taskStatistics: TaskStatistics = null,
    taskStatus: AuditTaskStatus = null,
    taskType: AuditTaskType = null
  ): DescribeAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (auditDetails != null) __obj.updateDynamic("auditDetails")(auditDetails)
    if (scheduledAuditName != null) __obj.updateDynamic("scheduledAuditName")(scheduledAuditName)
    if (taskStartTime != null) __obj.updateDynamic("taskStartTime")(taskStartTime)
    if (taskStatistics != null) __obj.updateDynamic("taskStatistics")(taskStatistics)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditTaskResponse]
  }
}

