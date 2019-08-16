package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodecommitMod {
  type AccountId = String
  type AdditionalData = String
  type Arn = String
  type BatchDescribeMergeConflictsErrors = js.Array[BatchDescribeMergeConflictsError]
  type BatchGetCommitsErrorsList = js.Array[BatchGetCommitsError]
  type BranchName = String
  type BranchNameList = js.Array[BranchName]
  type CapitalBoolean = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.A
    - typings.awsDashSdk.awsDashSdkStrings.M
    - typings.awsDashSdk.awsDashSdkStrings.D
    - java.lang.String
  */
  type ChangeTypeEnum = _ChangeTypeEnum | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type CloneUrlHttp = String
  type CloneUrlSsh = String
  type CommentId = String
  type Comments = js.Array[Comment]
  type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData = js.Array[CommentsForPullRequest]
  type CommitId = String
  type CommitIdsInputList = js.Array[ObjectId]
  type CommitName = String
  type CommitObjectsList = js.Array[Commit]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FILE_LEVEL
    - typings.awsDashSdk.awsDashSdkStrings.LINE_LEVEL
    - java.lang.String
  */
  type ConflictDetailLevelTypeEnum = _ConflictDetailLevelTypeEnum | String
  type ConflictMetadataList = js.Array[ConflictMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPT_SOURCE
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPT_DESTINATION
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMERGE
    - java.lang.String
  */
  type ConflictResolutionStrategyTypeEnum = _ConflictResolutionStrategyTypeEnum | String
  type Conflicts = js.Array[Conflict]
  type Content = String
  type CreationDate = Date
  type DeleteFileEntries = js.Array[DeleteFileEntry]
  type Description = String
  type DifferenceList = js.Array[Difference]
  type Email = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventDate = Date
  type ExceptionName = String
  type FileContent = Buffer | Uint8Array | Blob | String
  type FileList = js.Array[File]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTABLE
    - typings.awsDashSdk.awsDashSdkStrings.NORMAL
    - typings.awsDashSdk.awsDashSdkStrings.SYMLINK
    - java.lang.String
  */
  type FileModeTypeEnum = _FileModeTypeEnum | String
  type FilePaths = js.Array[Path]
  type FileSize = Double
  type FilesMetadata = js.Array[FileMetadata]
  type FolderList = js.Array[Folder]
  type HunkContent = String
  type IsCommentDeleted = Boolean
  type IsContentConflict = Boolean
  type IsFileModeConflict = Boolean
  type IsHunkConflict = Boolean
  type IsMergeable = Boolean
  type IsMerged = Boolean
  type IsMove = Boolean
  type IsObjectTypeConflict = Boolean
  type KeepEmptyFolders = Boolean
  type LastModifiedDate = Date
  type Limit = Double
  type LineNumber = Double
  type MaxResults = Double
  type MergeHunks = js.Array[MergeHunk]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAST_FORWARD_MERGE
    - typings.awsDashSdk.awsDashSdkStrings.SQUASH_MERGE
    - typings.awsDashSdk.awsDashSdkStrings.THREE_WAY_MERGE
    - java.lang.String
  */
  type MergeOptionTypeEnum = _MergeOptionTypeEnum | String
  type MergeOptions = js.Array[MergeOptionTypeEnum]
  type Message = String
  type Mode = String
  type Name = String
  type NextToken = String
  type NumberOfConflicts = Double
  type ObjectId = String
  type ObjectSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FILE
    - typings.awsDashSdk.awsDashSdkStrings.DIRECTORY
    - typings.awsDashSdk.awsDashSdkStrings.GIT_LINK
    - typings.awsDashSdk.awsDashSdkStrings.SYMBOLIC_LINK
    - java.lang.String
  */
  type ObjectTypeEnum = _ObjectTypeEnum | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ascending
    - typings.awsDashSdk.awsDashSdkStrings.descending
    - java.lang.String
  */
  type OrderEnum = _OrderEnum | String
  type ParentList = js.Array[ObjectId]
  type Path = String
  type Position = Double
  type PullRequestEventList = js.Array[PullRequestEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PULL_REQUEST_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.PULL_REQUEST_STATUS_CHANGED
    - typings.awsDashSdk.awsDashSdkStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
    - typings.awsDashSdk.awsDashSdkStrings.PULL_REQUEST_MERGE_STATE_CHANGED
    - java.lang.String
  */
  type PullRequestEventType = _PullRequestEventType | String
  type PullRequestId = String
  type PullRequestIdList = js.Array[PullRequestId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.CLOSED
    - java.lang.String
  */
  type PullRequestStatusEnum = _PullRequestStatusEnum | String
  type PullRequestTargetList = js.Array[PullRequestTarget]
  type PutFileEntries = js.Array[PutFileEntry]
  type ReferenceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BEFORE
    - typings.awsDashSdk.awsDashSdkStrings.AFTER
    - java.lang.String
  */
  type RelativeFileVersionEnum = _RelativeFileVersionEnum | String
  type ReplaceContentEntries = js.Array[ReplaceContentEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KEEP_BASE
    - typings.awsDashSdk.awsDashSdkStrings.KEEP_SOURCE
    - typings.awsDashSdk.awsDashSdkStrings.KEEP_DESTINATION
    - typings.awsDashSdk.awsDashSdkStrings.USE_NEW_CONTENT
    - java.lang.String
  */
  type ReplacementTypeEnum = _ReplacementTypeEnum | String
  type RepositoryDescription = String
  type RepositoryId = String
  type RepositoryMetadataList = js.Array[RepositoryMetadata]
  type RepositoryName = String
  type RepositoryNameIdPairList = js.Array[RepositoryNameIdPair]
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryNotFoundList = js.Array[RepositoryName]
  type RepositoryTriggerCustomData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.all
    - typings.awsDashSdk.awsDashSdkStrings.updateReference
    - typings.awsDashSdk.awsDashSdkStrings.createReference
    - typings.awsDashSdk.awsDashSdkStrings.deleteReference
    - java.lang.String
  */
  type RepositoryTriggerEventEnum = _RepositoryTriggerEventEnum | String
  type RepositoryTriggerEventList = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = String
  type RepositoryTriggerName = String
  type RepositoryTriggerNameList = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId = String
  type RepositoryTriggersList = js.Array[RepositoryTrigger]
  type ResourceArn = String
  type SetFileModeEntries = js.Array[SetFileModeEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.repositoryName
    - typings.awsDashSdk.awsDashSdkStrings.lastModifiedDate
    - java.lang.String
  */
  type SortByEnum = _SortByEnum | String
  type SubModuleList = js.Array[SubModule]
  type SymbolicLinkList = js.Array[SymbolicLink]
  type TagKey = String
  type TagKeysList = js.Array[TagKey]
  type TagValue = String
  type TagsMap = StringDictionary[TagValue]
  type TargetList = js.Array[Target]
  type Title = String
  type _Date = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-04-13`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type blob = Buffer | Uint8Array | Blob | String
}
