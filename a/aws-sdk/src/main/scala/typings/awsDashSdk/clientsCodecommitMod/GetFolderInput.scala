package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFolderInput extends js.Object {
  /**
    * A fully-qualified reference used to identify a commit that contains the version of the folder's content to return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no specifier is provided, the folder content will be returned as it exists in the HEAD commit.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.undefined
  /**
    * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example, /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of a repository. 
    */
  var folderPath: Path
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName
}

object GetFolderInput {
  @scala.inline
  def apply(folderPath: Path, repositoryName: RepositoryName, commitSpecifier: CommitName = null): GetFolderInput = {
    val __obj = js.Dynamic.literal(folderPath = folderPath, repositoryName = repositoryName)
    if (commitSpecifier != null) __obj.updateDynamic("commitSpecifier")(commitSpecifier)
    __obj.asInstanceOf[GetFolderInput]
  }
}

