package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContainerPolicyInput extends js.Object {
  /**
    * The name of the container that holds the policy.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object DeleteContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[DeleteContainerPolicyInput]
  }
}

