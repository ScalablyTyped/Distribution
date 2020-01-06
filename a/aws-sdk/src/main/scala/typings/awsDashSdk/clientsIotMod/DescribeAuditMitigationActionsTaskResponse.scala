package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
  /**
    * Specifies the mitigation actions and their parameters that are applied as part of this task.
    */
  var actionsDefinition: js.UndefOr[MitigationActionList] = js.native
  /**
    * Specifies the mitigation actions that should be applied to specific audit checks.
    */
  var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping] = js.native
  /**
    * The date and time when the task was completed or canceled.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task, or a set of findings.
    */
  var target: js.UndefOr[AuditMitigationActionsTaskTarget] = js.native
  /**
    * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation actions task.
    */
  var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics] = js.native
  /**
    * The current status of the task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
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
    if (actionsDefinition != null) __obj.updateDynamic("actionsDefinition")(actionsDefinition.asInstanceOf[js.Any])
    if (auditCheckToActionsMapping != null) __obj.updateDynamic("auditCheckToActionsMapping")(auditCheckToActionsMapping.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (taskStatistics != null) __obj.updateDynamic("taskStatistics")(taskStatistics.asInstanceOf[js.Any])
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
  }
}

