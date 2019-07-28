package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationResult extends js.Object {
  /**
    * Describes an AWS account's compliance with the AWS Firewall Manager policy.
    */
  var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.undefined
  /**
    * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if it is not associated with the specified policy.
    */
  var ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
}

object EvaluationResult {
  @scala.inline
  def apply(
    ComplianceStatus: PolicyComplianceStatusType = null,
    EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
    ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
  ): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (ComplianceStatus != null) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(EvaluationLimitExceeded)) __obj.updateDynamic("EvaluationLimitExceeded")(EvaluationLimitExceeded)
    if (!js.isUndefined(ViolatorCount)) __obj.updateDynamic("ViolatorCount")(ViolatorCount)
    __obj.asInstanceOf[EvaluationResult]
  }
}

