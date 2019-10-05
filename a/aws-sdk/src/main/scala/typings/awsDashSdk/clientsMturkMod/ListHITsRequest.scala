package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHITsRequest extends js.Object {
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListHITsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: PaginationToken = null): ListHITsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHITsRequest]
  }
}

