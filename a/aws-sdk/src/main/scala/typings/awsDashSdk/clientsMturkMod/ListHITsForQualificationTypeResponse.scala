package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHITsForQualificationTypeResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.undefined
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}

object ListHITsForQualificationTypeResponse {
  @scala.inline
  def apply(HITs: HITList = null, NextToken: PaginationToken = null, NumResults: Int | Double = null): ListHITsForQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (HITs != null) __obj.updateDynamic("HITs")(HITs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHITsForQualificationTypeResponse]
  }
}

