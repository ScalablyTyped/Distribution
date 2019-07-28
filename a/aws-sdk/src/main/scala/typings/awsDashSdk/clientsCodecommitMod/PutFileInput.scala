package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFileInput extends js.Object {
  /**
    * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will be created.
    */
  var branchName: BranchName
  /**
    * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in order to provide a more useful commit history for your repository.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  /**
    * An email address for the person adding or updating the file.
    */
  var email: js.UndefOr[Email] = js.undefined
  /**
    * The content of the file, in binary object format. 
    */
  var fileContent: FileContent
  /**
    * The file mode permissions of the blob. Valid file mode permissions are listed below.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  /**
    * The name of the file you want to add or update, including the relative path to the file in the repository.  If the path does not currently exist in the repository, the path will be created as part of adding the file. 
    */
  var filePath: Path
  /**
    * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order to provide a more useful commit history for your repository.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required.  The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the file will not be added or updated.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The name of the repository where you want to add or update the file.
    */
  var repositoryName: RepositoryName
}

object PutFileInput {
  @scala.inline
  def apply(
    branchName: BranchName,
    fileContent: FileContent,
    filePath: Path,
    repositoryName: RepositoryName,
    commitMessage: Message = null,
    email: Email = null,
    fileMode: FileModeTypeEnum = null,
    name: Name = null,
    parentCommitId: CommitId = null
  ): PutFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName, fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath, repositoryName = repositoryName)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentCommitId != null) __obj.updateDynamic("parentCommitId")(parentCommitId)
    __obj.asInstanceOf[PutFileInput]
  }
}

