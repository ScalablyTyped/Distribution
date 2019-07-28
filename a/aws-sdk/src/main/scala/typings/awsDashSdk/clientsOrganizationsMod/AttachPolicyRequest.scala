package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachPolicyRequest extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy by calling the ListPolicies operation. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var PolicyId: typings.awsDashSdk.clientsOrganizationsMod.PolicyId
  /**
    * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID by calling the ListRoots, ListOrganizationalUnitsForParent, or ListAccounts operations. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var TargetId: PolicyTargetId
}

object AttachPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId, TargetId: PolicyTargetId): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId, TargetId = TargetId)
  
    __obj.asInstanceOf[AttachPolicyRequest]
  }
}

