package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyRequest extends js.Object {
  /**
    * The policy content to add to the new policy. For example, if you create a service control policy (SCP), this string must be JSON text that specifies the permissions that admins in attached accounts can delegate to their users, groups, and roles. For more information about the SCP syntax, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: PolicyContent
  /**
    * An optional description to assign to the policy.
    */
  var Description: PolicyDescription
  /**
    * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: PolicyName
  /**
    * The type of policy to create.  In the current release, the only type of policy that you can create is a service control policy (SCP). 
    */
  var Type: PolicyType
}

object CreatePolicyRequest {
  @scala.inline
  def apply(Content: PolicyContent, Description: PolicyDescription, Name: PolicyName, Type: PolicyType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(Content = Content, Description = Description, Name = Name, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

