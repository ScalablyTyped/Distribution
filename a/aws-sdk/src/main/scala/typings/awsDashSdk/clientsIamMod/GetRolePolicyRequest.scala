package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRolePolicyRequest extends js.Object {
  /**
    * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
  /**
    * The name of the role associated with the policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object GetRolePolicyRequest {
  @scala.inline
  def apply(PolicyName: policyNameType, RoleName: roleNameType): GetRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, RoleName = RoleName)
  
    __obj.asInstanceOf[GetRolePolicyRequest]
  }
}

