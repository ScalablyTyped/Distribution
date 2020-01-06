package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceDetail extends js.Object {
  /**
    * Indicates if over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  /**
    * A timestamp that indicates when the returned information should be considered out of date.
    */
  var ExpiredAt: js.UndefOr[TimeStamp] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsDashSdk.clientsFmsMod.IssueInfoMap] = js.native
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
  /**
    * An array of resources that aren't protected by the AWS WAF or Shield Advanced policy or that aren't in compliance with the security group policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.native
}

object PolicyComplianceDetail {
  @scala.inline
  def apply(
    EvaluationLimitExceeded: js.UndefOr[scala.Boolean] = js.undefined,
    ExpiredAt: TimeStamp = null,
    IssueInfoMap: IssueInfoMap = null,
    MemberAccount: AWSAccountId = null,
    PolicyId: PolicyId = null,
    PolicyOwner: AWSAccountId = null,
    Violators: ComplianceViolators = null
  ): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EvaluationLimitExceeded)) __obj.updateDynamic("EvaluationLimitExceeded")(EvaluationLimitExceeded.asInstanceOf[js.Any])
    if (ExpiredAt != null) __obj.updateDynamic("ExpiredAt")(ExpiredAt.asInstanceOf[js.Any])
    if (IssueInfoMap != null) __obj.updateDynamic("IssueInfoMap")(IssueInfoMap.asInstanceOf[js.Any])
    if (MemberAccount != null) __obj.updateDynamic("MemberAccount")(MemberAccount.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (PolicyOwner != null) __obj.updateDynamic("PolicyOwner")(PolicyOwner.asInstanceOf[js.Any])
    if (Violators != null) __obj.updateDynamic("Violators")(Violators.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
}

