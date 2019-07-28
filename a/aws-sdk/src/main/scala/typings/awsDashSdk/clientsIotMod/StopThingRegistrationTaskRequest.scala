package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopThingRegistrationTaskRequest extends js.Object {
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: TaskId
}

object StopThingRegistrationTaskRequest {
  @scala.inline
  def apply(taskId: TaskId): StopThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[StopThingRegistrationTaskRequest]
  }
}

