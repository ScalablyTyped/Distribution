package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersionIdentifier extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object PolicyVersionIdentifier {
  @scala.inline
  def apply(policyName: PolicyName = null, policyVersionId: PolicyVersionId = null): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
}

