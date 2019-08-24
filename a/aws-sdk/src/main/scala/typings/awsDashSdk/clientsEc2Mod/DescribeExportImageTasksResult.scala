package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportImageTasksResult extends js.Object {
  /**
    * Information about the export image tasks.
    */
  var ExportImageTasks: js.UndefOr[ExportImageTaskList] = js.undefined
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.undefined
}

object DescribeExportImageTasksResult {
  @scala.inline
  def apply(ExportImageTasks: ExportImageTaskList = null, NextToken: NextToken = null): DescribeExportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ExportImageTasks != null) __obj.updateDynamic("ExportImageTasks")(ExportImageTasks)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeExportImageTasksResult]
  }
}

