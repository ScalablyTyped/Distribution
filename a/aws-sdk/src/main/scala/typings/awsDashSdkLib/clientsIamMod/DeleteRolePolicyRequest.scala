package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRolePolicyRequest extends js.Object {
  /**
    * The name of the inline policy to delete from the specified IAM role. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
  /**
    * The name (friendly name, not ARN) identifying the role that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object DeleteRolePolicyRequest {
  @scala.inline
  def apply(PolicyName: policyNameType, RoleName: roleNameType): DeleteRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, RoleName = RoleName)
  
    __obj.asInstanceOf[DeleteRolePolicyRequest]
  }
}

