package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingRegistrationTaskRequest extends js.Object {
  /**
    * The task ID.
    */
  var taskId: TaskId
}

object DescribeThingRegistrationTaskRequest {
  @scala.inline
  def apply(taskId: TaskId): DescribeThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId)
  
    __obj.asInstanceOf[DescribeThingRegistrationTaskRequest]
  }
}

