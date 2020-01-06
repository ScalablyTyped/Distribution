package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContributorInsightsOutput extends js.Object {
  /**
    * A list of ContributorInsightsSummary.
    */
  var ContributorInsightsSummaries: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ContributorInsightsSummaries
  ] = js.native
  /**
    * A token to go to the next page if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
}

object ListContributorInsightsOutput {
  @scala.inline
  def apply(
    ContributorInsightsSummaries: ContributorInsightsSummaries = null,
    NextToken: NextTokenString = null
  ): ListContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContributorInsightsSummaries != null) __obj.updateDynamic("ContributorInsightsSummaries")(ContributorInsightsSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContributorInsightsOutput]
  }
}

