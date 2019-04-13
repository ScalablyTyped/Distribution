package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForPolicyResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of structures, each of which contains details about one of the entities to which the specified policy is attached.
    */
  var Targets: js.UndefOr[PolicyTargets] = js.undefined
}

object ListTargetsForPolicyResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Targets: PolicyTargets = null): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
}

