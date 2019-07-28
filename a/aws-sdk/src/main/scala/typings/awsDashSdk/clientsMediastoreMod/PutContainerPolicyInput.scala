package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutContainerPolicyInput extends js.Object {
  /**
    * The name of the container.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
  /**
    * The contents of the policy, which includes the following:    One Version tag   One Statement tag that contains the standard tags for the policy.  
    */
  var Policy: ContainerPolicy
}

object PutContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, Policy: ContainerPolicy): PutContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName, Policy = Policy)
  
    __obj.asInstanceOf[PutContainerPolicyInput]
  }
}

