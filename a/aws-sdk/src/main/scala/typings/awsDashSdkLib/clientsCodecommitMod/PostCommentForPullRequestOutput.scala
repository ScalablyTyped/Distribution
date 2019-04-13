package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForPullRequestOutput extends js.Object {
  /**
    * In the directionality of the pull request, the blob ID of the 'after' blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full commit ID of the commit in the destination branch where the pull request will be merged.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * In the directionality of the pull request, the blob ID of the 'before' blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  /**
    * The location of the change where you posted your comment.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  /**
    * The name of the repository where you posted a comment on a pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
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
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
}

