package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerPolicyInput extends js.Object {
  /**
    * The name of the container. 
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object GetContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[GetContainerPolicyInput]
  }
}

