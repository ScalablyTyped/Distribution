package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportConfigurationsRequest extends js.Object {
  /**
    * A list of continuous export ids to search for.
    */
  var exportIds: js.UndefOr[ExportIds] = js.undefined
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeExportConfigurationsRequest {
  @scala.inline
  def apply(
    exportIds: ExportIds = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: NextToken = null
  ): DescribeExportConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (exportIds != null) __obj.updateDynamic("exportIds")(exportIds)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeExportConfigurationsRequest]
  }
}

