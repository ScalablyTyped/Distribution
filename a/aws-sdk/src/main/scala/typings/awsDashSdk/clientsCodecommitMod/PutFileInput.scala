package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileInput extends js.Object {
  /**
    * The name of the branch where you want to add or update the file. If this is an empty repository, this branch is created.
    */
  var branchName: BranchName = js.native
  /**
    * A message about why this file was added or updated. Although it is optional, a message makes the commit history for your repository more useful.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * An email address for the person adding or updating the file.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * The content of the file, in binary object format. 
    */
  var fileContent: FileContent = js.native
  /**
    * The file mode permissions of the blob. Valid file mode permissions are listed here.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The name of the file you want to add or update, including the relative path to the file in the repository.  If the path does not currently exist in the repository, the path is created as part of adding the file. 
    */
  var filePath: Path = js.native
  /**
    * The name of the person adding or updating the file. Although it is optional, a name makes the commit history for your repository more useful.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required.  The commit ID must match the ID of the head commit at the time of the operation. Otherwise, an error occurs, and the file is not added or updated.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The name of the repository where you want to add or update the file.
    */
  var repositoryName: RepositoryName = js.native
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
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentCommitId != null) __obj.updateDynamic("parentCommitId")(parentCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileInput]
  }
}

