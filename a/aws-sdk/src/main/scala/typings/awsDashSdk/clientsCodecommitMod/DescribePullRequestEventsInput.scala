package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePullRequestEventsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.undefined
  /**
    * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the maximum number of events that can be returned in a result.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Optional. The pull request event type about which you want to return information.
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
}

object DescribePullRequestEventsInput {
  @scala.inline
  def apply(
    pullRequestId: PullRequestId,
    actorArn: Arn = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    pullRequestEventType: PullRequestEventType = null
  ): DescribePullRequestEventsInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId)
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsInput]
  }
}

