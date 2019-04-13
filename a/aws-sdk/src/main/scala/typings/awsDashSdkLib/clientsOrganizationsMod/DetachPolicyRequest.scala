package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachPolicyRequest extends js.Object {
  /**
    * The unique identifier (ID) of the policy you want to detach. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var PolicyId: awsDashSdkLib.clientsOrganizationsMod.PolicyId
  /**
    * The unique identifier (ID) of the root, OU, or account from which you want to detach the policy. You can get the ID from the ListRoots, ListOrganizationalUnitsForParent, or ListAccounts operations. The regex pattern for a target ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: a string that consists of exactly 12 digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var TargetId: PolicyTargetId
}

object DetachPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId, TargetId: PolicyTargetId): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId, TargetId = TargetId)
  
    __obj.asInstanceOf[DetachPolicyRequest]
  }
}

