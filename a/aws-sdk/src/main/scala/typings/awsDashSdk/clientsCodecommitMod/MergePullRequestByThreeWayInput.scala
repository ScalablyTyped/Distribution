package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestByThreeWayInput extends js.Object {
  /**
    * The name of the author who created the commit. This information will be used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  /**
    * The commit message to include in the commit information for the merge.
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
    * The email address of the person merging the branches. This information will be used in the commit information for the merge.
    */
  var email: js.UndefOr[Email] = js.undefined
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file will be created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: RepositoryName
  /**
    * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.undefined
}

object MergePullRequestByThreeWayInput {
  @scala.inline
  def apply(
    pullRequestId: PullRequestId,
    repositoryName: RepositoryName,
    authorName: Name = null,
    commitMessage: Message = null,
    conflictDetailLevel: ConflictDetailLevelTypeEnum = null,
    conflictResolution: ConflictResolution = null,
    conflictResolutionStrategy: ConflictResolutionStrategyTypeEnum = null,
    email: Email = null,
    keepEmptyFolders: js.UndefOr[Boolean] = js.undefined,
    sourceCommitId: ObjectId = null
  ): MergePullRequestByThreeWayInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId, repositoryName = repositoryName)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (conflictDetailLevel != null) __obj.updateDynamic("conflictDetailLevel")(conflictDetailLevel.asInstanceOf[js.Any])
    if (conflictResolution != null) __obj.updateDynamic("conflictResolution")(conflictResolution)
    if (conflictResolutionStrategy != null) __obj.updateDynamic("conflictResolutionStrategy")(conflictResolutionStrategy.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders)
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId)
    __obj.asInstanceOf[MergePullRequestByThreeWayInput]
  }
}

