package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that the object lifecycle policy is assigned to.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object GetLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[GetLifecyclePolicyInput]
  }
}

