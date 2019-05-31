package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodecommitMod {
  type AccountId = java.lang.String
  type AdditionalData = java.lang.String
  type Arn = java.lang.String
  type BranchName = java.lang.String
  type BranchNameList = js.Array[BranchName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.A
    - awsDashSdkLib.awsDashSdkLibStrings.M
    - awsDashSdkLib.awsDashSdkLibStrings.D
    - java.lang.String
  */
  type ChangeTypeEnum = _ChangeTypeEnum | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CloneUrlHttp = java.lang.String
  type CloneUrlSsh = java.lang.String
  type CommentId = java.lang.String
  type Comments = js.Array[Comment]
  type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData = js.Array[CommentsForPullRequest]
  type CommitId = java.lang.String
  type CommitName = java.lang.String
  type Content = java.lang.String
  type CreationDate = stdLib.Date
  type DeleteFileEntries = js.Array[DeleteFileEntry]
  type Description = java.lang.String
  type DifferenceList = js.Array[Difference]
  type Email = java.lang.String
  type EventDate = stdLib.Date
  type FileContent = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type FileList = js.Array[File]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTABLE
    - awsDashSdkLib.awsDashSdkLibStrings.NORMAL
    - awsDashSdkLib.awsDashSdkLibStrings.SYMLINK
    - java.lang.String
  */
  type FileModeTypeEnum = _FileModeTypeEnum | java.lang.String
  type FilesMetadata = js.Array[FileMetadata]
  type FolderList = js.Array[Folder]
  type IsCommentDeleted = scala.Boolean
  type IsMergeable = scala.Boolean
  type IsMerged = scala.Boolean
  type IsMove = scala.Boolean
  type KeepEmptyFolders = scala.Boolean
  type LastModifiedDate = stdLib.Date
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MergeOptionTypeEnum = awsDashSdkLib.awsDashSdkLibStrings.FAST_FORWARD_MERGE | java.lang.String
  type Message = java.lang.String
  type Mode = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ObjectId = java.lang.String
  type ObjectSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ascending
    - awsDashSdkLib.awsDashSdkLibStrings.descending
    - java.lang.String
  */
  type OrderEnum = _OrderEnum | java.lang.String
  type ParentList = js.Array[ObjectId]
  type Path = java.lang.String
  type Position = scala.Double
  type PullRequestEventList = js.Array[PullRequestEvent]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PULL_REQUEST_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.PULL_REQUEST_STATUS_CHANGED
    - awsDashSdkLib.awsDashSdkLibStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
    - awsDashSdkLib.awsDashSdkLibStrings.PULL_REQUEST_MERGE_STATE_CHANGED
    - java.lang.String
  */
  type PullRequestEventType = _PullRequestEventType | java.lang.String
  type PullRequestId = java.lang.String
  type PullRequestIdList = js.Array[PullRequestId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN
    - awsDashSdkLib.awsDashSdkLibStrings.CLOSED
    - java.lang.String
  */
  type PullRequestStatusEnum = _PullRequestStatusEnum | java.lang.String
  type PullRequestTargetList = js.Array[PullRequestTarget]
  type PutFileEntries = js.Array[PutFileEntry]
  type ReferenceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BEFORE
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER
    - java.lang.String
  */
  type RelativeFileVersionEnum = _RelativeFileVersionEnum | java.lang.String
  type RepositoryDescription = java.lang.String
  type RepositoryId = java.lang.String
  type RepositoryMetadataList = js.Array[RepositoryMetadata]
  type RepositoryName = java.lang.String
  type RepositoryNameIdPairList = js.Array[RepositoryNameIdPair]
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryNotFoundList = js.Array[RepositoryName]
  type RepositoryTriggerCustomData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.all
    - awsDashSdkLib.awsDashSdkLibStrings.updateReference
    - awsDashSdkLib.awsDashSdkLibStrings.createReference
    - awsDashSdkLib.awsDashSdkLibStrings.deleteReference
    - java.lang.String
  */
  type RepositoryTriggerEventEnum = _RepositoryTriggerEventEnum | java.lang.String
  type RepositoryTriggerEventList = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = java.lang.String
  type RepositoryTriggerName = java.lang.String
  type RepositoryTriggerNameList = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId = java.lang.String
  type RepositoryTriggersList = js.Array[RepositoryTrigger]
  type ResourceArn = java.lang.String
  type SetFileModeEntries = js.Array[SetFileModeEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.repositoryName
    - awsDashSdkLib.awsDashSdkLibStrings.lastModifiedDate
    - java.lang.String
  */
  type SortByEnum = _SortByEnum | java.lang.String
  type SubModuleList = js.Array[SubModule]
  type SymbolicLinkList = js.Array[SymbolicLink]
  type TagKey = java.lang.String
  type TagKeysList = js.Array[TagKey]
  type TagValue = java.lang.String
  type TagsMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TargetList = js.Array[Target]
  type Title = java.lang.String
  type _Date = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-13`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
}
