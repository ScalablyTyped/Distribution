package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportTasksResponse extends js.Object {
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A returned array of import tasks that match any applied filters, up to the specified number of maximum results.
    */
  var tasks: js.UndefOr[ImportTaskList] = js.undefined
}

object DescribeImportTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tasks: ImportTaskList = null): DescribeImportTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[DescribeImportTasksResponse]
  }
}

