package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePolicyRequest extends js.Object {
  /**
    * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the syntax for the policy's type. For more information, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: js.UndefOr[PolicyContent] = js.native
  /**
    * If provided, the new description for the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * If provided, the new name for the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.native
  /**
    * The unique identifier (ID) of the policy that you want to update. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase letters or digits.
    */
  var PolicyId: typings.awsDashSdk.clientsOrganizationsMod.PolicyId = js.native
}

object UpdatePolicyRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    Content: PolicyContent = null,
    Description: PolicyDescription = null,
    Name: PolicyName = null
  ): UpdatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePolicyRequest]
  }
}

