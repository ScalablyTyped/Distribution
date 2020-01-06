package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForPullRequestOutput extends js.Object {
  /**
    * In the directionality of the pull request, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * The full commit ID of the commit in the destination branch where the pull request is merged.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  /**
    * In the directionality of the pull request, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * The location of the change where you posted your comment.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * The name of the repository where you posted a comment on a pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PostCommentForPullRequestOutput {
  @scala.inline
  def apply(
    afterBlobId: ObjectId = null,
    afterCommitId: CommitId = null,
    beforeBlobId: ObjectId = null,
    beforeCommitId: CommitId = null,
    comment: Comment = null,
    location: Location = null,
    pullRequestId: PullRequestId = null,
    repositoryName: RepositoryName = null
  ): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
}

