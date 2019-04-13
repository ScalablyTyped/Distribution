package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartThingRegistrationTaskResponse extends js.Object {
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}

object StartThingRegistrationTaskResponse {
  @scala.inline
  def apply(taskId: TaskId = null): StartThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[StartThingRegistrationTaskResponse]
  }
}

