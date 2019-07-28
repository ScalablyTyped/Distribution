package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyComplianceDetail extends js.Object {
  /**
    * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
  /**
    * A time stamp that indicates when the returned information should be considered out-of-date.
    */
  var ExpiredAt: js.UndefOr[TimeStamp] = js.undefined
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be non-compliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsDashSdk.clientsFmsMod.IssueInfoMap] = js.undefined
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.undefined
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
  /**
    * An array of resources that are not protected by the policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.undefined
}

object PolicyComplianceDetail {
  @scala.inline
  def apply(
    EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
    ExpiredAt: TimeStamp = null,
    IssueInfoMap: IssueInfoMap = null,
    MemberAccount: AWSAccountId = null,
    PolicyId: PolicyId = null,
    PolicyOwner: AWSAccountId = null,
    Violators: ComplianceViolators = null
  ): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EvaluationLimitExceeded)) __obj.updateDynamic("EvaluationLimitExceeded")(EvaluationLimitExceeded)
    if (ExpiredAt != null) __obj.updateDynamic("ExpiredAt")(ExpiredAt)
    if (IssueInfoMap != null) __obj.updateDynamic("IssueInfoMap")(IssueInfoMap)
    if (MemberAccount != null) __obj.updateDynamic("MemberAccount")(MemberAccount)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyOwner != null) __obj.updateDynamic("PolicyOwner")(PolicyOwner)
    if (Violators != null) __obj.updateDynamic("Violators")(Violators)
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
}

