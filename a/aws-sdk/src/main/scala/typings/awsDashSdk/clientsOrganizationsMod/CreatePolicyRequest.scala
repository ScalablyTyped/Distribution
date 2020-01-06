package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * The policy content to add to the new policy. For example, you could create a service control policy (SCP) that specifies the permissions that administrators in attached accounts can delegate to their users, groups, and roles. The string for this SCP must be JSON text. For more information about the SCP syntax, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: PolicyContent = js.native
  /**
    * An optional description to assign to the policy.
    */
  var Description: PolicyDescription = js.native
  /**
    * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: PolicyName = js.native
  /**
    * The type of policy to create.
    */
  var Type: PolicyType = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(Content: PolicyContent, Description: PolicyDescription, Name: PolicyName, Type: PolicyType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

