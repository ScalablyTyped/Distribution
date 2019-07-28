package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForComparedCommitOutput extends js.Object {
  /**
    * In the directionality you established, the blob ID of the 'after' blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * In the directionality you established, the full commit ID of the 'after' commit.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * In the directionality you established, the blob ID of the 'before' blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * In the directionality you established, the full commit ID of the 'before' commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  /**
    * The location of the comment in the comparison between the two commits.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the repository where you posted a comment on the comparison between commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
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
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (location != null) __obj.updateDynamic("location")(location)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
}

