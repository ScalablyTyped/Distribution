package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupPolicyResponse extends js.Object {
  /**
    * The group the policy is associated with.
    */
  var GroupName: groupNameType
  /**
    * The policy document.
    */
  var PolicyDocument: policyDocumentType
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType
}

object GetGroupPolicyResponse {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyDocument: policyDocumentType, PolicyName: policyNameType): GetGroupPolicyResponse = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, PolicyDocument = PolicyDocument, PolicyName = PolicyName)
  
    __obj.asInstanceOf[GetGroupPolicyResponse]
  }
}

