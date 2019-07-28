package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForPullRequestInput extends js.Object {
  /**
    * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request when you post the comment.
    */
  var afterCommitId: CommitId
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.
    */
  var beforeCommitId: CommitId
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The content of your comment on the change.
    */
  var content: Content
  /**
    * The location of the change where you want to post your comment. If no location is provided, the comment will be posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  /**
    * The name of the repository where you want to post a comment on a pull request.
    */
  var repositoryName: RepositoryName
}

object PostCommentForPullRequestInput {
  @scala.inline
  def apply(
    afterCommitId: CommitId,
    beforeCommitId: CommitId,
    content: Content,
    pullRequestId: PullRequestId,
    repositoryName: RepositoryName,
    clientRequestToken: ClientRequestToken = null,
    location: Location = null
  ): PostCommentForPullRequestInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId, beforeCommitId = beforeCommitId, content = content, pullRequestId = pullRequestId, repositoryName = repositoryName)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[PostCommentForPullRequestInput]
  }
}

