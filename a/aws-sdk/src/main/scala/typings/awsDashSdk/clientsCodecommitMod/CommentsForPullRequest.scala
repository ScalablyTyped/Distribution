package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsForPullRequest extends js.Object {
  /**
    * The full blob ID of the file on which you want to comment on the source commit.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * he full commit ID of the commit that was the tip of the source branch at the time the comment was made. 
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The full blob ID of the file on which you want to comment on the destination commit.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit will be superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * An array of comment objects. Each comment object contains information about a comment on the pull request.
    */
  var comments: js.UndefOr[Comments] = js.undefined
  /**
    * Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object CommentsForPullRequest {
  @scala.inline
  def apply(
    afterBlobId: ObjectId = null,
    afterCommitId: CommitId = null,
    beforeBlobId: ObjectId = null,
    beforeCommitId: CommitId = null,
    comments: Comments = null,
    location: Location = null,
    pullRequestId: PullRequestId = null,
    repositoryName: RepositoryName = null
  ): CommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[CommentsForPullRequest]
  }
}

