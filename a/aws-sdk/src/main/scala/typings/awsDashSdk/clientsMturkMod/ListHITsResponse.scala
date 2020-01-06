package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHITsResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListHITsResponse {
  @scala.inline
  def apply(HITs: HITList = null, NextToken: PaginationToken = null, NumResults: Int | Double = null): ListHITsResponse = {
    val __obj = js.Dynamic.literal()
    if (HITs != null) __obj.updateDynamic("HITs")(HITs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsResponse]
  }
}

