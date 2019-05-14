package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskExecutionResponse extends js.Object {
  /**
    * The physical number of bytes transferred over the network.
    */
  var BytesTransferred: js.UndefOr[long] = js.undefined
  /**
    * The number of logical bytes written to the destination AWS storage resource.
    */
  var BytesWritten: js.UndefOr[long] = js.undefined
  /**
    * The estimated physical number of bytes that is to be transferred over the network.
    */
  var EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined
  /**
    * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
    */
  var EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined
  /**
    *  Specifies that the task execution excludes files from the transfer based on the specified pattern in the filter. Transfers all files in the task’s subdirectory, except files that match the filter that is set. 
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  /**
    * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. This value can also be greater than EstimatedFilesTransferred in some cases. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
    */
  var FilesTransferred: js.UndefOr[long] = js.undefined
  /**
    *  Specifies that the task execution excludes files in the transfer based on the specified pattern in the filter. When multiple include filters are set, they are interpreted as an OR. 
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  var Options: js.UndefOr[Options] = js.undefined
  /**
    * The result of the task execution.
    */
  var Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined
  /**
    * The time that the task execution was started.
    */
  var StartTime: js.UndefOr[Time] = js.undefined
  /**
    * The status of the task execution.  For detailed information about task execution statuses, see "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-tasks.html#understand-task-creation-statuses" (Understanding Task Statuses).
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2. 
    */
  var TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
}

object DescribeTaskExecutionResponse {
  @scala.inline
  def apply(
    BytesTransferred: js.UndefOr[long] = js.undefined,
    BytesWritten: js.UndefOr[long] = js.undefined,
    EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined,
    EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined,
    Excludes: FilterList = null,
    FilesTransferred: js.UndefOr[long] = js.undefined,
    Includes: FilterList = null,
    Options: Options = null,
    Result: TaskExecutionResultDetail = null,
    StartTime: Time = null,
    Status: TaskExecutionStatus = null,
    TaskExecutionArn: TaskExecutionArn = null
  ): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesTransferred)) __obj.updateDynamic("BytesTransferred")(BytesTransferred)
    if (!js.isUndefined(BytesWritten)) __obj.updateDynamic("BytesWritten")(BytesWritten)
    if (!js.isUndefined(EstimatedBytesToTransfer)) __obj.updateDynamic("EstimatedBytesToTransfer")(EstimatedBytesToTransfer)
    if (!js.isUndefined(EstimatedFilesToTransfer)) __obj.updateDynamic("EstimatedFilesToTransfer")(EstimatedFilesToTransfer)
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes)
    if (!js.isUndefined(FilesTransferred)) __obj.updateDynamic("FilesTransferred")(FilesTransferred)
    if (Includes != null) __obj.updateDynamic("Includes")(Includes)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskExecutionArn != null) __obj.updateDynamic("TaskExecutionArn")(TaskExecutionArn)
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
}

