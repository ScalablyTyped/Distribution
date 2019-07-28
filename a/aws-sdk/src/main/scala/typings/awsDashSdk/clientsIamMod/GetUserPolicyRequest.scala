package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPolicyRequest extends js.Object {
  /**
    * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
  /**
    * The name of the user who the policy is associated with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object GetUserPolicyRequest {
  @scala.inline
  def apply(PolicyName: policyNameType, UserName: existingUserNameType): GetUserPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, UserName = UserName)
  
    __obj.asInstanceOf[GetUserPolicyRequest]
  }
}

