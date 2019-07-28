package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopAccessLoggingInput extends js.Object {
  /**
    * The name of the container that you want to stop access logging on.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
}

object StopAccessLoggingInput {
  @scala.inline
  def apply(ContainerName: ContainerName): StopAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[StopAccessLoggingInput]
  }
}

