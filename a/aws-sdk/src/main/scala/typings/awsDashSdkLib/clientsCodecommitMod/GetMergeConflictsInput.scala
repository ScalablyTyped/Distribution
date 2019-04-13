package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMergeConflictsInput extends js.Object {
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var destinationCommitSpecifier: CommitName
  /**
    * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
    */
  var mergeOption: MergeOptionTypeEnum
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: RepositoryName
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var sourceCommitSpecifier: CommitName
}

object GetMergeConflictsInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    mergeOption: MergeOptionTypeEnum,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): GetMergeConflictsInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier, mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName, sourceCommitSpecifier = sourceCommitSpecifier)
  
    __obj.asInstanceOf[GetMergeConflictsInput]
  }
}

