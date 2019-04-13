package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that holds the object lifecycle policy.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object DeleteLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[DeleteLifecyclePolicyInput]
  }
}

