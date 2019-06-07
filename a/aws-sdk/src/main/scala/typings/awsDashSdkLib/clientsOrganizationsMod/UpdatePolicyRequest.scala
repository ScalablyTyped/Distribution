package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePolicyRequest extends js.Object {
  /**
    * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the syntax for the policy's type. For more information, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: js.UndefOr[PolicyContent] = js.undefined
  /**
    * If provided, the new description for the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  /**
    * If provided, the new name for the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.undefined
  /**
    * The unique identifier (ID) of the policy that you want to update. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var PolicyId: awsDashSdkLib.clientsOrganizationsMod.PolicyId
}

object UpdatePolicyRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    Content: PolicyContent = null,
    Description: PolicyDescription = null,
    Name: PolicyName = null
  ): UpdatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdatePolicyRequest]
  }
}

