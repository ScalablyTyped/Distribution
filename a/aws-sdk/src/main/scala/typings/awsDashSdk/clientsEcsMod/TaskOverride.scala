package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOverride extends js.Object {
  /**
    * One or more container overrides sent to a task.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
    */
  var executionRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
    */
  var taskRoleArn: js.UndefOr[String] = js.undefined
}

object TaskOverride {
  @scala.inline
  def apply(
    containerOverrides: ContainerOverrides = null,
    executionRoleArn: String = null,
    taskRoleArn: String = null
  ): TaskOverride = {
    val __obj = js.Dynamic.literal()
    if (containerOverrides != null) __obj.updateDynamic("containerOverrides")(containerOverrides)
    if (executionRoleArn != null) __obj.updateDynamic("executionRoleArn")(executionRoleArn)
    if (taskRoleArn != null) __obj.updateDynamic("taskRoleArn")(taskRoleArn)
    __obj.asInstanceOf[TaskOverride]
  }
}

