package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceStatus extends js.Object {
  /**
    * An array of EvaluationResult objects.
    */
  var EvaluationResults: js.UndefOr[typings.awsDashSdk.clientsFmsMod.EvaluationResults] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsDashSdk.clientsFmsMod.IssueInfoMap] = js.native
  /**
    * Timestamp of the last update to the EvaluationResult objects.
    */
  var LastUpdated: js.UndefOr[TimeStamp] = js.native
  /**
    * The member account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.native
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
}

object PolicyComplianceStatus {
  @scala.inline
  def apply(
    EvaluationResults: EvaluationResults = null,
    IssueInfoMap: IssueInfoMap = null,
    LastUpdated: TimeStamp = null,
    MemberAccount: AWSAccountId = null,
    PolicyId: PolicyId = null,
    PolicyName: ResourceName = null,
    PolicyOwner: AWSAccountId = null
  ): PolicyComplianceStatus = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResults != null) __obj.updateDynamic("EvaluationResults")(EvaluationResults.asInstanceOf[js.Any])
    if (IssueInfoMap != null) __obj.updateDynamic("IssueInfoMap")(IssueInfoMap.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (MemberAccount != null) __obj.updateDynamic("MemberAccount")(MemberAccount.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (PolicyOwner != null) __obj.updateDynamic("PolicyOwner")(PolicyOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyComplianceStatus]
  }
}

