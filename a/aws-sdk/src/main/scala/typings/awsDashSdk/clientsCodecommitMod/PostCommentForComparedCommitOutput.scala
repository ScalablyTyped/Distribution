package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForComparedCommitOutput extends js.Object {
  /**
    * In the directionality you established, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * In the directionality you established, the full commit ID of the after commit.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  /**
    * In the directionality you established, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * In the directionality you established, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * The location of the comment in the comparison between the two commits.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The name of the repository where you posted a comment on the comparison between commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PostCommentForComparedCommitOutput {
  @scala.inline
  def apply(
    afterBlobId: ObjectId = null,
    afterCommitId: CommitId = null,
    beforeBlobId: ObjectId = null,
    beforeCommitId: CommitId = null,
    comment: Comment = null,
    location: Location = null,
    repositoryName: RepositoryName = null
  ): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
}

