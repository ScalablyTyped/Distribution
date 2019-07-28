package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceDetailRequest extends js.Object {
  /**
    * The AWS account that owns the resources that you want to get the details for.
    */
  var MemberAccount: AWSAccountId
  /**
    * The ID of the policy that you want to get the details for. PolicyId is returned by PutPolicy and by ListPolicies.
    */
  var PolicyId: typings.awsDashSdk.clientsFmsMod.PolicyId
}

object GetComplianceDetailRequest {
  @scala.inline
  def apply(MemberAccount: AWSAccountId, PolicyId: PolicyId): GetComplianceDetailRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount, PolicyId = PolicyId)
  
    __obj.asInstanceOf[GetComplianceDetailRequest]
  }
}

