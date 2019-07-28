package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerPolicyOutput extends js.Object {
  /**
    * The contents of the access policy.
    */
  var Policy: ContainerPolicy
}

object GetContainerPolicyOutput {
  @scala.inline
  def apply(Policy: ContainerPolicy): GetContainerPolicyOutput = {
    val __obj = js.Dynamic.literal(Policy = Policy)
  
    __obj.asInstanceOf[GetContainerPolicyOutput]
  }
}

