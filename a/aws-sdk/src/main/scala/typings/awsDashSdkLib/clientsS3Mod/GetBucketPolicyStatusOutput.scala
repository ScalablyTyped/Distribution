package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketPolicyStatusOutput extends js.Object {
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[PolicyStatus] = js.undefined
}

object GetBucketPolicyStatusOutput {
  @scala.inline
  def apply(PolicyStatus: PolicyStatus = null): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyStatus != null) __obj.updateDynamic("PolicyStatus")(PolicyStatus)
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
}

