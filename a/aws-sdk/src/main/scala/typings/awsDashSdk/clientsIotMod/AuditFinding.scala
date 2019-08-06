package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditFinding extends js.Object {
  /**
    * The audit check that generated this result.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.undefined
  /**
    * A unique identifier for this set of audit findings. This identifier is used to apply mitigation tasks to one or more sets of findings.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  /**
    * The time the result (finding) was discovered.
    */
  var findingTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The resource that was found to be noncompliant with the audit check.
    */
  var nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined
  /**
    * The reason the resource was noncompliant.
    */
  var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined
  /**
    * A code that indicates the reason that the resource was noncompliant.
    */
  var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined
  /**
    * The list of related resources.
    */
  var relatedResources: js.UndefOr[RelatedResources] = js.undefined
  /**
    * The severity of the result (finding).
    */
  var severity: js.UndefOr[AuditFindingSeverity] = js.undefined
  /**
    * The ID of the audit that generated this result (finding).
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[Timestamp] = js.undefined
}

object AuditFinding {
  @scala.inline
  def apply(
    checkName: AuditCheckName = null,
    findingId: FindingId = null,
    findingTime: Timestamp = null,
    nonCompliantResource: NonCompliantResource = null,
    reasonForNonCompliance: ReasonForNonCompliance = null,
    reasonForNonComplianceCode: ReasonForNonComplianceCode = null,
    relatedResources: RelatedResources = null,
    severity: AuditFindingSeverity = null,
    taskId: AuditTaskId = null,
    taskStartTime: Timestamp = null
  ): AuditFinding = {
    val __obj = js.Dynamic.literal()
    if (checkName != null) __obj.updateDynamic("checkName")(checkName)
    if (findingId != null) __obj.updateDynamic("findingId")(findingId)
    if (findingTime != null) __obj.updateDynamic("findingTime")(findingTime)
    if (nonCompliantResource != null) __obj.updateDynamic("nonCompliantResource")(nonCompliantResource)
    if (reasonForNonCompliance != null) __obj.updateDynamic("reasonForNonCompliance")(reasonForNonCompliance)
    if (reasonForNonComplianceCode != null) __obj.updateDynamic("reasonForNonComplianceCode")(reasonForNonComplianceCode)
    if (relatedResources != null) __obj.updateDynamic("relatedResources")(relatedResources)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (taskStartTime != null) __obj.updateDynamic("taskStartTime")(taskStartTime)
    __obj.asInstanceOf[AuditFinding]
  }
}

