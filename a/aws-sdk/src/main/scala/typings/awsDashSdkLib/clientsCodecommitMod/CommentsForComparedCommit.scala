package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsForComparedCommit extends js.Object {
  /**
    * The full blob ID of the commit used to establish the 'after' of the comparison.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full commit ID of the commit used to establish the 'after' of the comparison.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The full blob ID of the commit used to establish the 'before' of the comparison.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full commit ID of the commit used to establish the 'before' of the comparison.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * An array of comment objects. Each comment object contains information about a comment on the comparison between commits.
    */
  var comments: js.UndefOr[Comments] = js.undefined
  /**
    * Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the repository that contains the compared commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object CommentsForComparedCommit {
  @scala.inline
  def apply(
    afterBlobId: ObjectId = null,
    afterCommitId: CommitId = null,
    beforeBlobId: ObjectId = null,
    beforeCommitId: CommitId = null,
    comments: Comments = null,
    location: Location = null,
    repositoryName: RepositoryName = null
  ): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (location != null) __obj.updateDynamic("location")(location)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
}

