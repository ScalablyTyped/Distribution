package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInput extends js.Object {
  /**
    * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the head commit will be used.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.undefined
  /**
    * The fully-qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path
  /**
    * The name of the repository that contains the file.
    */
  var repositoryName: RepositoryName
}

object GetFileInput {
  @scala.inline
  def apply(filePath: Path, repositoryName: RepositoryName, commitSpecifier: CommitName = null): GetFileInput = {
    val __obj = js.Dynamic.literal(filePath = filePath, repositoryName = repositoryName)
    if (commitSpecifier != null) __obj.updateDynamic("commitSpecifier")(commitSpecifier)
    __obj.asInstanceOf[GetFileInput]
  }
}

