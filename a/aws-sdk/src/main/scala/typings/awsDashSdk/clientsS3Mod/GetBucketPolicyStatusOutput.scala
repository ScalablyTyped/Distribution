package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyStatusOutput extends js.Object {
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PolicyStatus] = js.native
}

object GetBucketPolicyStatusOutput {
  @scala.inline
  def apply(PolicyStatus: PolicyStatus = null): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyStatus != null) __obj.updateDynamic("PolicyStatus")(PolicyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
}

