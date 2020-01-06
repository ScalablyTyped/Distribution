package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchInfo extends js.Object {
  /**
    * The name of the branch.
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    * The ID of the last commit made to the branch.
    */
  var commitId: js.UndefOr[CommitId] = js.native
}

object BranchInfo {
  @scala.inline
  def apply(branchName: BranchName = null, commitId: CommitId = null): BranchInfo = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchInfo]
  }
}

