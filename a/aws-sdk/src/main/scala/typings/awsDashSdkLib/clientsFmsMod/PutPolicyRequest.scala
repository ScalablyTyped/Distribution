package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPolicyRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy to be created.
    */
  var Policy: awsDashSdkLib.clientsFmsMod.Policy
}

object PutPolicyRequest {
  @scala.inline
  def apply(Policy: Policy): PutPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy)
  
    __obj.asInstanceOf[PutPolicyRequest]
  }
}

