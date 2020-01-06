package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyVersionsResponse extends js.Object {
  /**
    * The policy versions.
    */
  var policyVersions: js.UndefOr[PolicyVersions] = js.native
}

object ListPolicyVersionsResponse {
  @scala.inline
  def apply(policyVersions: PolicyVersions = null): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (policyVersions != null) __obj.updateDynamic("policyVersions")(policyVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
}

