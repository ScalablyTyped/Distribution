package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
  /**
    * Specifies the mitigation actions and their parameters that are applied as part of this task.
    */
  var actionsDefinition: js.UndefOr[MitigationActionList] = js.undefined
  /**
    * Specifies the mitigation actions that should be applied to specific audit checks.
    */
  var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping] = js.undefined
  /**
    * The date and time when the task was completed or canceled.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task, or a set of findings.
    */
  var target: js.UndefOr[AuditMitigationActionsTaskTarget] = js.undefined
  /**
    * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation actions task.
    */
  var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics] = js.undefined
  /**
    * The current status of the task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}

object DescribeAuditMitigationActionsTaskResponse {
  @scala.inline
  def apply(
    actionsDefinition: MitigationActionList = null,
    auditCheckToActionsMapping: AuditCheckToActionsMapping = null,
    endTime: Timestamp = null,
    startTime: Timestamp = null,
    target: AuditMitigationActionsTaskTarget = null,
    taskStatistics: AuditMitigationActionsTaskStatistics = null,
    taskStatus: AuditMitigationActionsTaskStatus = null
  ): DescribeAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (actionsDefinition != null) __obj.updateDynamic("actionsDefinition")(actionsDefinition)
    if (auditCheckToActionsMapping != null) __obj.updateDynamic("auditCheckToActionsMapping")(auditCheckToActionsMapping)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (target != null) __obj.updateDynamic("target")(target)
    if (taskStatistics != null) __obj.updateDynamic("taskStatistics")(taskStatistics)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
  }
}

