package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketPolicyOutput extends js.Object {
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object GetBucketPolicyOutput {
  @scala.inline
  def apply(Policy: Policy = null): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
}

