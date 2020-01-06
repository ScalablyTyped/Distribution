package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy to be created.
    */
  var Policy: typings.awsDashSdk.clientsFmsMod.Policy = js.native
}

object PutPolicyRequest {
  @scala.inline
  def apply(Policy: Policy): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutPolicyRequest]
  }
}

