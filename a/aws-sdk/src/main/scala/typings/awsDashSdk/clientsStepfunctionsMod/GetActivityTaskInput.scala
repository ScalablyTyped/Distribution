package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityTaskInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the activity to retrieve tasks from (assigned when you create the task using CreateActivity.)
    */
  var activityArn: Arn = js.native
  /**
    * You can provide an arbitrary name in order to identify the worker that the task is assigned to. This name is used when it is logged in the execution history.
    */
  var workerName: js.UndefOr[Name] = js.native
}

object GetActivityTaskInput {
  @scala.inline
  def apply(activityArn: Arn, workerName: Name = null): GetActivityTaskInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    if (workerName != null) __obj.updateDynamic("workerName")(workerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityTaskInput]
  }
}

