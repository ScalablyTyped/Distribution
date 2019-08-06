package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  /**
    * The time that the task was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task execution that is syncing files.
    */
  var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS storage resource's location.
    */
  var DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the destination ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var DestinationNetworkInterfaceArns: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.DestinationNetworkInterfaceArns] = js.undefined
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.undefined
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  /**
    * The name of the task that was described.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the overriding OverrideOptions value to operation. 
    */
  var Options: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source file system's location.
    */
  var SourceLocationArn: js.UndefOr[LocationArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var SourceNetworkInterfaceArns: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.SourceNetworkInterfaceArns] = js.undefined
  /**
    * The status of the task that was described. For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task that was described.
    */
  var TaskArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskArn] = js.undefined
}

object DescribeTaskResponse {
  @scala.inline
  def apply(
    CloudWatchLogGroupArn: LogGroupArn = null,
    CreationTime: Time = null,
    CurrentTaskExecutionArn: TaskExecutionArn = null,
    DestinationLocationArn: LocationArn = null,
    DestinationNetworkInterfaceArns: DestinationNetworkInterfaceArns = null,
    ErrorCode: String = null,
    ErrorDetail: String = null,
    Excludes: FilterList = null,
    Name: TagValue = null,
    Options: Options = null,
    SourceLocationArn: LocationArn = null,
    SourceNetworkInterfaceArns: SourceNetworkInterfaceArns = null,
    Status: TaskStatus = null,
    TaskArn: TaskArn = null
  ): DescribeTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogGroupArn != null) __obj.updateDynamic("CloudWatchLogGroupArn")(CloudWatchLogGroupArn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (CurrentTaskExecutionArn != null) __obj.updateDynamic("CurrentTaskExecutionArn")(CurrentTaskExecutionArn)
    if (DestinationLocationArn != null) __obj.updateDynamic("DestinationLocationArn")(DestinationLocationArn)
    if (DestinationNetworkInterfaceArns != null) __obj.updateDynamic("DestinationNetworkInterfaceArns")(DestinationNetworkInterfaceArns)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (SourceLocationArn != null) __obj.updateDynamic("SourceLocationArn")(SourceLocationArn)
    if (SourceNetworkInterfaceArns != null) __obj.updateDynamic("SourceNetworkInterfaceArns")(SourceNetworkInterfaceArns)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    __obj.asInstanceOf[DescribeTaskResponse]
  }
}

