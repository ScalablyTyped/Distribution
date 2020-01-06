package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecisionTaskScheduledEventAttributes extends js.Object {
  /**
    * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this duration. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The name of the task list in which the decision task was scheduled.
    */
  var taskList: TaskList = js.native
  /**
    *  A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
}

object DecisionTaskScheduledEventAttributes {
  @scala.inline
  def apply(
    taskList: TaskList,
    startToCloseTimeout: DurationInSecondsOptional = null,
    taskPriority: TaskPriority = null
  ): DecisionTaskScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(taskList = taskList.asInstanceOf[js.Any])
    if (startToCloseTimeout != null) __obj.updateDynamic("startToCloseTimeout")(startToCloseTimeout.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskScheduledEventAttributes]
  }
}

