package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAssumeRolePolicyRequest extends js.Object {
  /**
    * The policy that grants an entity permission to assume the role. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyDocument: policyDocumentType
  /**
    * The name of the role to update with the new policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object UpdateAssumeRolePolicyRequest {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, RoleName: roleNameType): UpdateAssumeRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument, RoleName = RoleName)
  
    __obj.asInstanceOf[UpdateAssumeRolePolicyRequest]
  }
}

