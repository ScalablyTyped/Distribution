package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContainerInput extends js.Object {
  /**
    * The name of the container to delete. 
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
}

object DeleteContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[DeleteContainerInput]
  }
}

