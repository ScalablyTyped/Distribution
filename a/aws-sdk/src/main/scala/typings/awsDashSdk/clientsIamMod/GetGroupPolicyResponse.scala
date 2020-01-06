package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupPolicyResponse extends js.Object {
  /**
    * The group the policy is associated with.
    */
  var GroupName: groupNameType = js.native
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType = js.native
}

object GetGroupPolicyResponse {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyDocument: policyDocumentType, PolicyName: policyNameType): GetGroupPolicyResponse = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupPolicyResponse]
  }
}

