package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileInput extends js.Object {
  /**
    * The name of the branch where the commit will be made deleting the file.
    */
  var branchName: BranchName
  /**
    * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  /**
    * The email address for the commit that deletes the file. If no email address is specified, the email address will be left blank.
    */
  var email: js.UndefOr[Email] = js.undefined
  /**
    * The fully-qualified path to the file that will be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path
  /**
    * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  /**
    * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used as the author name and committer name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit ID.
    */
  var parentCommitId: CommitId
  /**
    * The name of the repository that contains the file to delete.
    */
  var repositoryName: RepositoryName
}

object DeleteFileInput {
  @scala.inline
  def apply(
    branchName: BranchName,
    filePath: Path,
    parentCommitId: CommitId,
    repositoryName: RepositoryName,
    commitMessage: Message = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[Boolean] = js.undefined,
    name: Name = null
  ): DeleteFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName, filePath = filePath, parentCommitId = parentCommitId, repositoryName = repositoryName)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeleteFileInput]
  }
}

