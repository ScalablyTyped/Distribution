package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitHubLocation extends js.Object {
  /**
    * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
  /**
    * The GitHub account and repository pair that stores a reference to the commit that represents the bundled artifacts for the application revision.  Specified as account/repository.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}

object GitHubLocation {
  @scala.inline
  def apply(commitId: CommitId = null, repository: Repository = null): GitHubLocation = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[GitHubLocation]
  }
}

