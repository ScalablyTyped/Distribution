package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the object lifecycle policy to.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
  /**
    * The object lifecycle policy to apply to the container.
    */
  var LifecyclePolicy: typings.awsDashSdk.clientsMediastoreMod.LifecyclePolicy
}

object PutLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, LifecyclePolicy: LifecyclePolicy): PutLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName, LifecyclePolicy = LifecyclePolicy)
  
    __obj.asInstanceOf[PutLifecyclePolicyInput]
  }
}

