package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTask extends js.Object {
  /**
    * The name of Amazon S3 bucket to which the log data was exported.
    */
  var destination: js.UndefOr[ExportDestinationBucket] = js.undefined
  /**
    * The prefix that was used as the start of Amazon S3 key for every object exported.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined
  /**
    * Execution info about the export task.
    */
  var executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined
  /**
    * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not exported.
    */
  var from: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the log group from which logs data was exported.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The status of the export task.
    */
  var status: js.UndefOr[ExportTaskStatus] = js.undefined
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.undefined
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.undefined
  /**
    * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: js.UndefOr[Timestamp] = js.undefined
}

object ExportTask {
  @scala.inline
  def apply(
    destination: ExportDestinationBucket = null,
    destinationPrefix: ExportDestinationPrefix = null,
    executionInfo: ExportTaskExecutionInfo = null,
    from: js.UndefOr[Timestamp] = js.undefined,
    logGroupName: LogGroupName = null,
    status: ExportTaskStatus = null,
    taskId: ExportTaskId = null,
    taskName: ExportTaskName = null,
    to: js.UndefOr[Timestamp] = js.undefined
  ): ExportTask = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (destinationPrefix != null) __obj.updateDynamic("destinationPrefix")(destinationPrefix)
    if (executionInfo != null) __obj.updateDynamic("executionInfo")(executionInfo)
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (taskName != null) __obj.updateDynamic("taskName")(taskName)
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ExportTask]
  }
}

