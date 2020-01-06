package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerPolicyOutput extends js.Object {
  /**
    * The contents of the access policy.
    */
  var Policy: ContainerPolicy = js.native
}

object GetContainerPolicyOutput {
  @scala.inline
  def apply(Policy: ContainerPolicy): GetContainerPolicyOutput = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetContainerPolicyOutput]
  }
}

