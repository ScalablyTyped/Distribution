package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUnreferencedMergeCommitInput extends js.Object {
  /**
    * The name of the author who created the unreferenced commit. This information will be used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  /**
    * The commit message for the unreferenced commit.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which will return a not mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict will be considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined
  /**
    * A list of inputs to use when resolving conflicts during a merge if AUTOMERGE is chosen as the conflict resolution strategy.
    */
  var conflictResolution: js.UndefOr[ConflictResolution] = js.undefined
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation will be successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var destinationCommitSpecifier: CommitName
  /**
    * The email address for the person who created the unreferenced commit.
    */
  var email: js.UndefOr[Email] = js.undefined
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file will be created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  /**
    * The merge option or strategy you want to use to merge the code.
    */
  var mergeOption: MergeOptionTypeEnum
  /**
    * The name of the repository where you want to create the unreferenced merge commit.
    */
  var repositoryName: RepositoryName
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.
    */
  var sourceCommitSpecifier: CommitName
}

object CreateUnreferencedMergeCommitInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    mergeOption: MergeOptionTypeEnum,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName,
    authorName: Name = null,
    commitMessage: Message = null,
    conflictDetailLevel: ConflictDetailLevelTypeEnum = null,
    conflictResolution: ConflictResolution = null,
    conflictResolutionStrategy: ConflictResolutionStrategyTypeEnum = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  ): CreateUnreferencedMergeCommitInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier, mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName, sourceCommitSpecifier = sourceCommitSpecifier)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (conflictDetailLevel != null) __obj.updateDynamic("conflictDetailLevel")(conflictDetailLevel.asInstanceOf[js.Any])
    if (conflictResolution != null) __obj.updateDynamic("conflictResolution")(conflictResolution)
    if (conflictResolutionStrategy != null) __obj.updateDynamic("conflictResolutionStrategy")(conflictResolutionStrategy.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders)
    __obj.asInstanceOf[CreateUnreferencedMergeCommitInput]
  }
}

