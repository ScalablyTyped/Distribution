package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  /**
    * The name of the task to update.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  var Options: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource name of the task to update.
    */
  var TaskArn: typings.awsDashSdk.clientsDatasyncMod.TaskArn
}

object UpdateTaskRequest {
  @scala.inline
  def apply(
    TaskArn: TaskArn,
    CloudWatchLogGroupArn: LogGroupArn = null,
    Excludes: FilterList = null,
    Name: TagValue = null,
    Options: Options = null
  ): UpdateTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
    if (CloudWatchLogGroupArn != null) __obj.updateDynamic("CloudWatchLogGroupArn")(CloudWatchLogGroupArn)
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    __obj.asInstanceOf[UpdateTaskRequest]
  }
}

