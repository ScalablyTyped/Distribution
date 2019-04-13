package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerInput extends js.Object {
  /**
    * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS account within a specific region. As an example, you could create a container named movies in every region, as long as you don’t have an existing container with that name.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object CreateContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName): CreateContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[CreateContainerInput]
  }
}

