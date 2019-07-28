package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMergeConflictsInput extends js.Object {
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which will return a not mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict will be considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation will be successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var destinationCommitSpecifier: CommitName
  /**
    * The maximum number of files to include in the output.
    */
  var maxConflictFiles: js.UndefOr[MaxResults] = js.undefined
  /**
    * The merge option or strategy you want to use to merge the code. 
    */
  var mergeOption: MergeOptionTypeEnum
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
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
    sourceCommitSpecifier: CommitName,
    conflictDetailLevel: ConflictDetailLevelTypeEnum = null,
    conflictResolutionStrategy: ConflictResolutionStrategyTypeEnum = null,
    maxConflictFiles: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): GetMergeConflictsInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier, mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName, sourceCommitSpecifier = sourceCommitSpecifier)
    if (conflictDetailLevel != null) __obj.updateDynamic("conflictDetailLevel")(conflictDetailLevel.asInstanceOf[js.Any])
    if (conflictResolutionStrategy != null) __obj.updateDynamic("conflictResolutionStrategy")(conflictResolutionStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConflictFiles)) __obj.updateDynamic("maxConflictFiles")(maxConflictFiles)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetMergeConflictsInput]
  }
}

