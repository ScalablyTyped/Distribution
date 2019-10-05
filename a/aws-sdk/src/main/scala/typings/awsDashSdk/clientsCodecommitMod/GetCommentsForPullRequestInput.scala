package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForPullRequestInput extends js.Object {
  /**
    * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was made.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * A non-negative integer used to limit the number of returned results. The default is 100 comments. You can return up to 500 comments with a single request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object GetCommentsForPullRequestInput {
  @scala.inline
  def apply(
    pullRequestId: PullRequestId,
    afterCommitId: CommitId = null,
    beforeCommitId: CommitId = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    repositoryName: RepositoryName = null
  ): GetCommentsForPullRequestInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[GetCommentsForPullRequestInput]
  }
}

