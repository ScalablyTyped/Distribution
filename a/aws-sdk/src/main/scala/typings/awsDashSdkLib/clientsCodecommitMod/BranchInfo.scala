package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchInfo extends js.Object {
  /**
    * The name of the branch.
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  /**
    * The ID of the last commit made to the branch.
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
}

object BranchInfo {
  @scala.inline
  def apply(branchName: BranchName = null, commitId: CommitId = null): BranchInfo = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    __obj.asInstanceOf[BranchInfo]
  }
}

