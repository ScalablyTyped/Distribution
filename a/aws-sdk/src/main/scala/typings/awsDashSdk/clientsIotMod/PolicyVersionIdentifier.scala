package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyVersionIdentifier extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}

object PolicyVersionIdentifier {
  @scala.inline
  def apply(policyName: PolicyName = null, policyVersionId: PolicyVersionId = null): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId)
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
}

