package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkerBlocksRequest extends js.Object {
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListWorkerBlocksRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[ResultSize] = js.undefined, NextToken: PaginationToken = null): ListWorkerBlocksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListWorkerBlocksRequest]
  }
}

