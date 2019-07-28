package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRolePolicyResponse extends js.Object {
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType
  /**
    * The role the policy is associated with.
    */
  var RoleName: roleNameType
}

object GetRolePolicyResponse {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, RoleName: roleNameType): GetRolePolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument, PolicyName = PolicyName, RoleName = RoleName)
  
    __obj.asInstanceOf[GetRolePolicyResponse]
  }
}

