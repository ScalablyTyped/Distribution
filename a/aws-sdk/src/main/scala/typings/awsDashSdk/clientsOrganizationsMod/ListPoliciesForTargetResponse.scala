package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesForTargetResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.NextToken] = js.native
  /**
    * The list of policies that match the criteria in the request.
    */
  var Policies: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Policies] = js.native
}

object ListPoliciesForTargetResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Policies: Policies = null): ListPoliciesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesForTargetResponse]
  }
}

