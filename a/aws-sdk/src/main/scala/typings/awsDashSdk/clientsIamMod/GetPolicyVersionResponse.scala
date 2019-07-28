package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyVersionResponse extends js.Object {
  /**
    * A structure containing details about the policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsDashSdk.clientsIamMod.PolicyVersion] = js.undefined
}

object GetPolicyVersionResponse {
  @scala.inline
  def apply(PolicyVersion: PolicyVersion = null): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyVersion != null) __obj.updateDynamic("PolicyVersion")(PolicyVersion)
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
}

