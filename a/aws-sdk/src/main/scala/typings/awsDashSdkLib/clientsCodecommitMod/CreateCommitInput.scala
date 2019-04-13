package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCommitInput extends js.Object {
  /**
    * The name of the author who created the commit. This information will be used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  /**
    * The name of the branch where you will create the commit.
    */
  var branchName: BranchName
  /**
    * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  /**
    * The files to delete in this commit. These files will still exist in prior commits.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined
  /**
    * The email address of the person who created the commit.
    */
  var email: js.UndefOr[Email] = js.undefined
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  /**
    * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is not required.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The files to add or update in this commit.
    */
  var putFiles: js.UndefOr[PutFileEntries] = js.undefined
  /**
    * The name of the repository where you will create the commit.
    */
  var repositoryName: RepositoryName
  /**
    * The file modes to update for files in this commit.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
}

object CreateCommitInput {
  @scala.inline
  def apply(
    branchName: BranchName,
    repositoryName: RepositoryName,
    authorName: Name = null,
    commitMessage: Message = null,
    deleteFiles: DeleteFileEntries = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
    parentCommitId: CommitId = null,
    putFiles: PutFileEntries = null,
    setFileModes: SetFileModeEntries = null
  ): CreateCommitInput = {
    val __obj = js.Dynamic.literal(branchName = branchName, repositoryName = repositoryName)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (deleteFiles != null) __obj.updateDynamic("deleteFiles")(deleteFiles)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders)
    if (parentCommitId != null) __obj.updateDynamic("parentCommitId")(parentCommitId)
    if (putFiles != null) __obj.updateDynamic("putFiles")(putFiles)
    if (setFileModes != null) __obj.updateDynamic("setFileModes")(setFileModes)
    __obj.asInstanceOf[CreateCommitInput]
  }
}

