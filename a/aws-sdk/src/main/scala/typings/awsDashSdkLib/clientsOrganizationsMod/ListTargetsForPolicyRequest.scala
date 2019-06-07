package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForPolicyRequest extends js.Object {
  /**
    * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The unique identifier (ID) of the policy whose attachments you want to know. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var PolicyId: awsDashSdkLib.clientsOrganizationsMod.PolicyId
}

object ListTargetsForPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListTargetsForPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTargetsForPolicyRequest]
  }
}

