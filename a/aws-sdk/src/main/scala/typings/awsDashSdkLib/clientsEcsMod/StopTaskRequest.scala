package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTaskRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can use this parameter to specify the reason for stopping the task here, and the message appears in subsequent DescribeTasks API operations on this task. Up to 255 characters are allowed in this message.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task to stop.
    */
  var task: String
}

object StopTaskRequest {
  @scala.inline
  def apply(task: String, cluster: String = null, reason: String = null): StopTaskRequest = {
    val __obj = js.Dynamic.literal(task = task)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[StopTaskRequest]
  }
}

