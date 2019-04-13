package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPolicyResponse extends js.Object {
  /**
    * The policy document.
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

