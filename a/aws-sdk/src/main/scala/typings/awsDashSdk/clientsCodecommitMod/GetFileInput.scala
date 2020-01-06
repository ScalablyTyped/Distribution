package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileInput extends js.Object {
  /**
    * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, the head commit is used.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.native
  /**
    * The fully qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path = js.native
  /**
    * The name of the repository that contains the file.
    */
  var repositoryName: RepositoryName = js.native
}

object GetFileInput {
  @scala.inline
  def apply(filePath: Path, repositoryName: RepositoryName, commitSpecifier: CommitName = null): GetFileInput = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (commitSpecifier != null) __obj.updateDynamic("commitSpecifier")(commitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInput]
  }
}

