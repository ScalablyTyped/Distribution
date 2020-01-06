package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksResponse extends js.Object {
  /**
    * Contains one or more sets of export request details. When the status of a request is SUCCEEDED, the response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  /**
    * The nextToken value to include in a future DescribeExportTasks request. When the results of a DescribeExportTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportTasksResponse {
  @scala.inline
  def apply(exportsInfo: ExportsInfo = null, nextToken: NextToken = null): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (exportsInfo != null) __obj.updateDynamic("exportsInfo")(exportsInfo.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
}

