package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContinuousExportsRequest extends js.Object {
  /**
    * The unique IDs assigned to the exports.
    */
  var exportIds: js.UndefOr[ContinuousExportIds] = js.undefined
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeContinuousExportsRequest {
  @scala.inline
  def apply(
    exportIds: ContinuousExportIds = null,
    maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined,
    nextToken: NextToken = null
  ): DescribeContinuousExportsRequest = {
    val __obj = js.Dynamic.literal()
    if (exportIds != null) __obj.updateDynamic("exportIds")(exportIds)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeContinuousExportsRequest]
  }
}

