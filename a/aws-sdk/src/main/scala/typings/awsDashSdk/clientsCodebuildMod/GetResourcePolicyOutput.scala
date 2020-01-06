package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyOutput extends js.Object {
  /**
    *  The resource policy for the resource identified by the input ARN parameter. 
    */
  var policy: js.UndefOr[NonEmptyString] = js.native
}

object GetResourcePolicyOutput {
  @scala.inline
  def apply(policy: NonEmptyString = null): GetResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyOutput]
  }
}

