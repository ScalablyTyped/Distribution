package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDestination extends js.Object {
  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.native
  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var gitHub: js.UndefOr[GitHubCodeDestination] = js.native
}

object CodeDestination {
  @scala.inline
  def apply(codeCommit: CodeCommitCodeDestination = null, gitHub: GitHubCodeDestination = null): CodeDestination = {
    val __obj = js.Dynamic.literal()
    if (codeCommit != null) __obj.updateDynamic("codeCommit")(codeCommit.asInstanceOf[js.Any])
    if (gitHub != null) __obj.updateDynamic("gitHub")(gitHub.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeDestination]
  }
}

