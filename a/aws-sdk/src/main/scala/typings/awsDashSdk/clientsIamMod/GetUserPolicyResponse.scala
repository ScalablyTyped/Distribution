package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPolicyResponse extends js.Object {
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType
  /**
    * The user the policy is associated with.
    */
  var UserName: existingUserNameType
}

object GetUserPolicyResponse {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, UserName: existingUserNameType): GetUserPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument, PolicyName = PolicyName, UserName = UserName)
  
    __obj.asInstanceOf[GetUserPolicyResponse]
  }
}

