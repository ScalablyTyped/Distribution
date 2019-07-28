package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBranchInput extends js.Object {
  /**
    * The name of the branch for which you want to retrieve information.
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  /**
    * The name of the repository that contains the branch for which you want to retrieve information.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object GetBranchInput {
  @scala.inline
  def apply(branchName: BranchName = null, repositoryName: RepositoryName = null): GetBranchInput = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[GetBranchInput]
  }
}

