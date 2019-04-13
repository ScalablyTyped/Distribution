package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyComplianceStatus extends js.Object {
  /**
    * An array of EvaluationResult objects.
    */
  var EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be non-compliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[IssueInfoMap] = js.undefined
  /**
    * Time stamp of the last update to the EvaluationResult objects.
    */
  var LastUpdated: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The member account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[PolicyId] = js.undefined
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
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
    if (EvaluationResults != null) __obj.updateDynamic("EvaluationResults")(EvaluationResults)
    if (IssueInfoMap != null) __obj.updateDynamic("IssueInfoMap")(IssueInfoMap)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (MemberAccount != null) __obj.updateDynamic("MemberAccount")(MemberAccount)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (PolicyOwner != null) __obj.updateDynamic("PolicyOwner")(PolicyOwner)
    __obj.asInstanceOf[PolicyComplianceStatus]
  }
}

