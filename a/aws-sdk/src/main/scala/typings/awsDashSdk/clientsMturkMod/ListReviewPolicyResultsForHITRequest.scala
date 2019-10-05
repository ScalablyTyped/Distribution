package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReviewPolicyResultsForHITRequest extends js.Object {
  /**
    * The unique identifier of the HIT to retrieve review results for.
    */
  var HITId: EntityId
  /**
    * Limit the number of results returned.
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to retrieve all data for both policy levels. For a list of all the described policies, see Review Policies. 
    */
  var PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined
  /**
    *  Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their outcomes. 
    */
  var RetrieveActions: js.UndefOr[Boolean] = js.undefined
  /**
    *  Specify if the operation should retrieve a list of the results computed by the Review Policies. 
    */
  var RetrieveResults: js.UndefOr[Boolean] = js.undefined
}

object ListReviewPolicyResultsForHITRequest {
  @scala.inline
  def apply(
    HITId: EntityId,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    PolicyLevels: ReviewPolicyLevelList = null,
    RetrieveActions: js.UndefOr[scala.Boolean] = js.undefined,
    RetrieveResults: js.UndefOr[scala.Boolean] = js.undefined
  ): ListReviewPolicyResultsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PolicyLevels != null) __obj.updateDynamic("PolicyLevels")(PolicyLevels)
    if (!js.isUndefined(RetrieveActions)) __obj.updateDynamic("RetrieveActions")(RetrieveActions)
    if (!js.isUndefined(RetrieveResults)) __obj.updateDynamic("RetrieveResults")(RetrieveResults)
    __obj.asInstanceOf[ListReviewPolicyResultsForHITRequest]
  }
}

