package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointPolicyStatusResult extends js.Object {
  /**
    * Indicates the current policy status of the specified access point.
    */
  var PolicyStatus: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.PolicyStatus] = js.native
}

object GetAccessPointPolicyStatusResult {
  @scala.inline
  def apply(PolicyStatus: PolicyStatus = null): GetAccessPointPolicyStatusResult = {
    val __obj = js.Dynamic.literal()
    if (PolicyStatus != null) __obj.updateDynamic("PolicyStatus")(PolicyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyStatusResult]
  }
}

