package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAccessLoggingInput extends js.Object {
  /**
    * The name of the container that you want to start access logging on.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
}

object StartAccessLoggingInput {
  @scala.inline
  def apply(ContainerName: ContainerName): StartAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[StartAccessLoggingInput]
  }
}

