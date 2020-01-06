package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    * Information about an AWS CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.native
}

object Repository {
  @scala.inline
  def apply(CodeCommit: CodeCommitRepository = null): Repository = {
    val __obj = js.Dynamic.literal()
    if (CodeCommit != null) __obj.updateDynamic("CodeCommit")(CodeCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

