package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  /**
    * Any additional data associated with the specified commit.
    */
  var additionalData: js.UndefOr[AdditionalData] = js.undefined
  /**
    * Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.
    */
  var author: js.UndefOr[UserInfo] = js.undefined
  /**
    * The full SHA of the specified commit. 
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git. For more information about the difference between an author and a committer in Git, see Viewing the Commit History in Pro Git by Scott Chacon and Ben Straub.
    */
  var committer: js.UndefOr[UserInfo] = js.undefined
  /**
    * The commit message associated with the specified commit.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
    */
  var parents: js.UndefOr[ParentList] = js.undefined
  /**
    * Tree information for the specified commit.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object Commit {
  @scala.inline
  def apply(
    additionalData: AdditionalData = null,
    author: UserInfo = null,
    commitId: ObjectId = null,
    committer: UserInfo = null,
    message: Message = null,
    parents: ParentList = null,
    treeId: ObjectId = null
  ): Commit = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData)
    if (author != null) __obj.updateDynamic("author")(author)
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[Commit]
  }
}

