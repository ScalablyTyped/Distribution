package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeBranchesByFastForwardInput extends js.Object {
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var destinationCommitSpecifier: CommitName
  /**
    * The name of the repository where you want to merge two branches.
    */
  var repositoryName: RepositoryName
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var sourceCommitSpecifier: CommitName
  /**
    * The branch where the merge will be applied.
    */
  var targetBranch: js.UndefOr[BranchName] = js.undefined
}

object MergeBranchesByFastForwardInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName,
    targetBranch: BranchName = null
  ): MergeBranchesByFastForwardInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier, repositoryName = repositoryName, sourceCommitSpecifier = sourceCommitSpecifier)
    if (targetBranch != null) __obj.updateDynamic("targetBranch")(targetBranch)
    __obj.asInstanceOf[MergeBranchesByFastForwardInput]
  }
}

