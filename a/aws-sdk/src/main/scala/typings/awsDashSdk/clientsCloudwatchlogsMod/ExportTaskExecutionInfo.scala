package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTaskExecutionInfo extends js.Object {
  /**
    * The completion time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var completionTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The creation time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
}

object ExportTaskExecutionInfo {
  @scala.inline
  def apply(
    completionTime: js.UndefOr[Timestamp] = js.undefined,
    creationTime: js.UndefOr[Timestamp] = js.undefined
  ): ExportTaskExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completionTime)) __obj.updateDynamic("completionTime")(completionTime)
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime)
    __obj.asInstanceOf[ExportTaskExecutionInfo]
  }
}

