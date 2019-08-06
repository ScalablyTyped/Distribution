package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task.  For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.  For more information about how to use CloudWatch Logs with DataSync, see Monitoring Your Task in the AWS DataSync User Guide. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an AWS storage resource's location. 
    */
  var DestinationLocationArn: LocationArn
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  /**
    * The name of a task. This value is a text reference that is used to identify the task in the console. 
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting a the task execution. For more information, see the operation. 
    */
  var Options: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source location for the task.
    */
  var SourceLocationArn: LocationArn
  /**
    * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty string. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateTaskRequest {
  @scala.inline
  def apply(
    DestinationLocationArn: LocationArn,
    SourceLocationArn: LocationArn,
    CloudWatchLogGroupArn: LogGroupArn = null,
    Excludes: FilterList = null,
    Name: TagValue = null,
    Options: Options = null,
    Tags: TagList = null
  ): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationLocationArn = DestinationLocationArn, SourceLocationArn = SourceLocationArn)
    if (CloudWatchLogGroupArn != null) __obj.updateDynamic("CloudWatchLogGroupArn")(CloudWatchLogGroupArn)
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

