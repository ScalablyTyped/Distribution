package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReviewableHITsRequest extends js.Object {
  /**
    *  The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are considered 
    */
  var HITTypeId: js.UndefOr[EntityId] = js.undefined
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  Can be either Reviewable or Reviewing. Reviewable is the default value. 
    */
  var Status: js.UndefOr[ReviewableHITStatus] = js.undefined
}

object ListReviewableHITsRequest {
  @scala.inline
  def apply(
    HITTypeId: EntityId = null,
    MaxResults: js.UndefOr[ResultSize] = js.undefined,
    NextToken: PaginationToken = null,
    Status: ReviewableHITStatus = null
  ): ListReviewableHITsRequest = {
    val __obj = js.Dynamic.literal()
    if (HITTypeId != null) __obj.updateDynamic("HITTypeId")(HITTypeId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewableHITsRequest]
  }
}

