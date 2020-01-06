package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoryAssociationsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListRecommendations request. When the results of a ListRecommendations request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodegurureviewerMod.NextToken] = js.native
  /**
    * A list of repository associations that meet the criteria of the request.
    */
  var RepositoryAssociationSummaries: js.UndefOr[typings.awsDashSdk.clientsCodegurureviewerMod.RepositoryAssociationSummaries] = js.native
}

object ListRepositoryAssociationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RepositoryAssociationSummaries: RepositoryAssociationSummaries = null): ListRepositoryAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RepositoryAssociationSummaries != null) __obj.updateDynamic("RepositoryAssociationSummaries")(RepositoryAssociationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoryAssociationsResponse]
  }
}

