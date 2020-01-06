package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingRegistrationTaskReportsRequest extends js.Object {
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The type of task report.
    */
  var reportType: ReportType = js.native
  /**
    * The id of the task.
    */
  var taskId: TaskId = js.native
}

object ListThingRegistrationTaskReportsRequest {
  @scala.inline
  def apply(
    reportType: ReportType,
    taskId: TaskId,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListThingRegistrationTaskReportsRequest = {
    val __obj = js.Dynamic.literal(reportType = reportType.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTaskReportsRequest]
  }
}

