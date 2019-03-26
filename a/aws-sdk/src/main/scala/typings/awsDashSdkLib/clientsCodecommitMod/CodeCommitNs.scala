package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/codecommit", "CodeCommit")
@js.native
object CodeCommitNs extends js.Object {
  trait BatchGetRepositoriesInput extends js.Object {
    /**
      * The names of the repositories to get information about.
      */
    var repositoryNames: RepositoryNameList
  }
  
  trait BatchGetRepositoriesOutput extends js.Object {
    /**
      * A list of repositories returned by the batch get repositories operation.
      */
    var repositories: js.UndefOr[RepositoryMetadataList] = js.undefined
    /**
      * Returns a list of repository names for which information could not be found.
      */
    var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined
  }
  
  trait BlobMetadata extends js.Object {
    /**
      * The full ID of the blob.
      */
    var blobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The file mode permissions of the blob. File mode permission codes include:    100644 indicates read/write    100755 indicates read/write/execute    160000 indicates a submodule    120000 indicates a symlink  
      */
    var mode: js.UndefOr[Mode] = js.undefined
    /**
      * The path to the blob and any associated file name, if any.
      */
    var path: js.UndefOr[Path] = js.undefined
  }
  
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
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Comment extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the person who posted the comment.
      */
    var authorArn: js.UndefOr[Arn] = js.undefined
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The system-generated comment ID.
      */
    var commentId: js.UndefOr[CommentId] = js.undefined
    /**
      * The content of the comment.
      */
    var content: js.UndefOr[Content] = js.undefined
    /**
      * The date and time the comment was created, in timestamp format.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * A Boolean value indicating whether the comment has been deleted.
      */
    var deleted: js.UndefOr[IsCommentDeleted] = js.undefined
    /**
      * The ID of the comment for which this comment is a reply, if any.
      */
    var inReplyTo: js.UndefOr[CommentId] = js.undefined
    /**
      * The date and time the comment was most recently modified, in timestamp format.
      */
    var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
  }
  
  trait CommentsForComparedCommit extends js.Object {
    /**
      * The full blob ID of the commit used to establish the 'after' of the comparison.
      */
    var afterBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The full commit ID of the commit used to establish the 'after' of the comparison.
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The full blob ID of the commit used to establish the 'before' of the comparison.
      */
    var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The full commit ID of the commit used to establish the 'before' of the comparison.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * An array of comment objects. Each comment object contains information about a comment on the comparison between commits.
      */
    var comments: js.UndefOr[Comments] = js.undefined
    /**
      * Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The name of the repository that contains the compared commits.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait CommentsForPullRequest extends js.Object {
    /**
      * The full blob ID of the file on which you want to comment on the source commit.
      */
    var afterBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * he full commit ID of the commit that was the tip of the source branch at the time the comment was made. 
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The full blob ID of the file on which you want to comment on the destination commit.
      */
    var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit will be superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * An array of comment objects. Each comment object contains information about a comment on the pull request.
      */
    var comments: js.UndefOr[Comments] = js.undefined
    /**
      * Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The system-generated ID of the pull request.
      */
    var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
    /**
      * The name of the repository that contains the pull request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait Commit extends js.Object {
    /**
      * Any additional data associated with the specified commit.
      */
    var additionalData: js.UndefOr[AdditionalData] = js.undefined
    /**
      * Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.
      */
    var author: js.UndefOr[UserInfo] = js.undefined
    /**
      * The full SHA of the specified commit. 
      */
    var commitId: js.UndefOr[ObjectId] = js.undefined
    /**
      * Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git. For more information about the difference between an author and a committer in Git, see Viewing the Commit History in Pro Git by Scott Chacon and Ben Straub.
      */
    var committer: js.UndefOr[UserInfo] = js.undefined
    /**
      * The commit message associated with the specified commit.
      */
    var message: js.UndefOr[Message] = js.undefined
    /**
      * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
      */
    var parents: js.UndefOr[ParentList] = js.undefined
    /**
      * Tree information for the specified commit.
      */
    var treeId: js.UndefOr[ObjectId] = js.undefined
  }
  
  trait CreateBranchInput extends js.Object {
    /**
      * The name of the new branch to create.
      */
    var branchName: BranchName
    /**
      * The ID of the commit to point the new branch to.
      */
    var commitId: CommitId
    /**
      * The name of the repository in which you want to create the new branch.
      */
    var repositoryName: RepositoryName
  }
  
  trait CreateCommitInput extends js.Object {
    /**
      * The name of the author who created the commit. This information will be used as both the author and committer for the commit.
      */
    var authorName: js.UndefOr[Name] = js.undefined
    /**
      * The name of the branch where you will create the commit.
      */
    var branchName: BranchName
    /**
      * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.
      */
    var commitMessage: js.UndefOr[Message] = js.undefined
    /**
      * The files to delete in this commit. These files will still exist in prior commits.
      */
    var deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined
    /**
      * The email address of the person who created the commit.
      */
    var email: js.UndefOr[Email] = js.undefined
    /**
      * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
      */
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
    /**
      * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is not required.
      */
    var parentCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The files to add or update in this commit.
      */
    var putFiles: js.UndefOr[PutFileEntries] = js.undefined
    /**
      * The name of the repository where you will create the commit.
      */
    var repositoryName: RepositoryName
    /**
      * The file modes to update for files in this commit.
      */
    var setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
  }
  
  trait CreateCommitOutput extends js.Object {
    /**
      * The full commit ID of the commit that contains your committed file changes.
      */
    var commitId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The files added as part of the committed file changes.
      */
    var filesAdded: js.UndefOr[FilesMetadata] = js.undefined
    /**
      * The files deleted as part of the committed file changes.
      */
    var filesDeleted: js.UndefOr[FilesMetadata] = js.undefined
    /**
      * The files updated as part of the commited file changes.
      */
    var filesUpdated: js.UndefOr[FilesMetadata] = js.undefined
    /**
      * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
      */
    var treeId: js.UndefOr[ObjectId] = js.undefined
  }
  
  trait CreatePullRequestInput extends js.Object {
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency token, as this will be done for you. 
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * A description of the pull request.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the destination where the creator of the pull request intends the code to be merged after the pull request is closed (the destination branch).
      */
    var targets: TargetList
    /**
      * The title of the pull request. This title will be used to identify the pull request to other users in the repository.
      */
    var title: Title
  }
  
  trait CreatePullRequestOutput extends js.Object {
    /**
      * Information about the newly created pull request.
      */
    var pullRequest: PullRequest
  }
  
  trait CreateRepositoryInput extends js.Object {
    /**
      * A comment or description about the new repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    /**
      * The name of the new repository to be created.  The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide. The suffix ".git" is prohibited. 
      */
    var repositoryName: RepositoryName
  }
  
  trait CreateRepositoryOutput extends js.Object {
    /**
      * Information about the newly created repository.
      */
    var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
  }
  
  trait DeleteBranchInput extends js.Object {
    /**
      * The name of the branch to delete.
      */
    var branchName: BranchName
    /**
      * The name of the repository that contains the branch to be deleted.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteBranchOutput extends js.Object {
    /**
      * Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.
      */
    var deletedBranch: js.UndefOr[BranchInfo] = js.undefined
  }
  
  trait DeleteCommentContentInput extends js.Object {
    /**
      * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
      */
    var commentId: CommentId
  }
  
  trait DeleteCommentContentOutput extends js.Object {
    /**
      * Information about the comment you just deleted.
      */
    var comment: js.UndefOr[Comment] = js.undefined
  }
  
  trait DeleteFileEntry extends js.Object {
    /**
      * The full path of the file that will be deleted, including the name of the file.
      */
    var filePath: Path
  }
  
  trait DeleteFileInput extends js.Object {
    /**
      * The name of the branch where the commit will be made deleting the file.
      */
    var branchName: BranchName
    /**
      * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.
      */
    var commitMessage: js.UndefOr[Message] = js.undefined
    /**
      * The email address for the commit that deletes the file. If no email address is specified, the email address will be left blank.
      */
    var email: js.UndefOr[Email] = js.undefined
    /**
      * The fully-qualified path to the file that will be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
      */
    var filePath: Path
    /**
      * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
      */
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
    /**
      * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used as the author name and committer name.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit ID.
      */
    var parentCommitId: CommitId
    /**
      * The name of the repository that contains the file to delete.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteFileOutput extends js.Object {
    /**
      * The blob ID removed from the tree as part of deleting the file.
      */
    var blobId: ObjectId
    /**
      * The full commit ID of the commit that contains the change that deletes the file.
      */
    var commitId: ObjectId
    /**
      * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
      */
    var filePath: Path
    /**
      * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
      */
    var treeId: ObjectId
  }
  
  trait DeleteRepositoryInput extends js.Object {
    /**
      * The name of the repository to delete.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteRepositoryOutput extends js.Object {
    /**
      * The ID of the repository that was deleted.
      */
    var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  }
  
  trait DescribePullRequestEventsInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.
      */
    var actorArn: js.UndefOr[Arn] = js.undefined
    /**
      * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the maximum number of events that can be returned in a result.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Optional. The pull request event type about which you want to return information.
      */
    var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
  }
  
  trait DescribePullRequestEventsOutput extends js.Object {
    /**
      * An enumeration token that can be used in a request to return the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the pull request events.
      */
    var pullRequestEvents: PullRequestEventList
  }
  
  trait Difference extends js.Object {
    /**
      * Information about an afterBlob data type object, including the ID, the file mode permission code, and the path.
      */
    var afterBlob: js.UndefOr[BlobMetadata] = js.undefined
    /**
      * Information about a beforeBlob data type object, including the ID, the file mode permission code, and the path.
      */
    var beforeBlob: js.UndefOr[BlobMetadata] = js.undefined
    /**
      * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
      */
    var changeType: js.UndefOr[ChangeTypeEnum] = js.undefined
  }
  
  trait File extends js.Object {
    /**
      * The fully-qualified path to the file in the repository.
      */
    var absolutePath: js.UndefOr[Path] = js.undefined
    /**
      * The blob ID that contains the file information.
      */
    var blobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
      */
    var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    /**
      * The relative path of the file from the folder where the query originated.
      */
    var relativePath: js.UndefOr[Path] = js.undefined
  }
  
  trait FileMetadata extends js.Object {
    /**
      * The full path to the file that will be added or updated, including the name of the file.
      */
    var absolutePath: js.UndefOr[Path] = js.undefined
    /**
      * The blob ID that contains the file information.
      */
    var blobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
      */
    var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  }
  
  trait Folder extends js.Object {
    /**
      * The fully-qualified path of the folder in the repository.
      */
    var absolutePath: js.UndefOr[Path] = js.undefined
    /**
      * The relative path of the specified folder from the folder where the query originated.
      */
    var relativePath: js.UndefOr[Path] = js.undefined
    /**
      * The full SHA-1 pointer of the tree information for the commit that contains the folder.
      */
    var treeId: js.UndefOr[ObjectId] = js.undefined
  }
  
  trait GetBlobInput extends js.Object {
    /**
      * The ID of the blob, which is its SHA-1 pointer.
      */
    var blobId: ObjectId
    /**
      * The name of the repository that contains the blob.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetBlobOutput extends js.Object {
    /**
      * The content of the blob, usually a file.
      */
    var content: blob
  }
  
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
  
  trait GetBranchOutput extends js.Object {
    /**
      * The name of the branch.
      */
    var branch: js.UndefOr[BranchInfo] = js.undefined
  }
  
  trait GetCommentInput extends js.Object {
    /**
      * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
      */
    var commentId: CommentId
  }
  
  trait GetCommentOutput extends js.Object {
    /**
      * The contents of the comment.
      */
    var comment: js.UndefOr[Comment] = js.undefined
  }
  
  trait GetCommentsForComparedCommitInput extends js.Object {
    /**
      * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
      */
    var afterCommitId: CommitId
    /**
      * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * A non-negative integer used to limit the number of returned results. The default is 100 comments, and is configurable up to 500.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the repository where you want to compare commits.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetCommentsForComparedCommitOutput extends js.Object {
    /**
      * A list of comment objects on the compared commit.
      */
    var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.undefined
    /**
      * An enumeration token that can be used in a request to return the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetCommentsForPullRequestInput extends js.Object {
    /**
      * The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was made.
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * A non-negative integer used to limit the number of returned results. The default is 100 comments. You can return up to 500 comments with a single request.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
    /**
      * The name of the repository that contains the pull request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait GetCommentsForPullRequestOutput extends js.Object {
    /**
      * An array of comment objects on the pull request.
      */
    var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.undefined
    /**
      * An enumeration token that can be used in a request to return the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetCommitInput extends js.Object {
    /**
      * The commit ID. Commit IDs are the full SHA of the commit.
      */
    var commitId: ObjectId
    /**
      * The name of the repository to which the commit was made.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetCommitOutput extends js.Object {
    /**
      * A commit data type object that contains information about the specified commit.
      */
    var commit: Commit
  }
  
  trait GetDifferencesInput extends js.Object {
    /**
      * A non-negative integer used to limit the number of returned results.
      */
    var MaxResults: js.UndefOr[Limit] = js.undefined
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
      */
    var afterCommitSpecifier: CommitName
    /**
      * The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all paths.
      */
    var afterPath: js.UndefOr[Path] = js.undefined
    /**
      * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit ID. Optional. If not specified, all changes prior to the afterCommitSpecifier value will be shown. If you do not use beforeCommitSpecifier in your request, consider limiting the results with maxResults.
      */
    var beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined
    /**
      * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If beforePath and afterPath are not specified, differences will be shown for all paths.
      */
    var beforePath: js.UndefOr[Path] = js.undefined
    /**
      * The name of the repository where you want to get differences.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetDifferencesOutput extends js.Object {
    /**
      * An enumeration token that can be used in a request to return the next batch of the results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).
      */
    var differences: js.UndefOr[DifferenceList] = js.undefined
  }
  
  trait GetFileInput extends js.Object {
    /**
      * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the head commit will be used.
      */
    var commitSpecifier: js.UndefOr[CommitName] = js.undefined
    /**
      * The fully-qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
      */
    var filePath: Path
    /**
      * The name of the repository that contains the file.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetFileOutput extends js.Object {
    /**
      * The blob ID of the object that represents the file content.
      */
    var blobId: ObjectId
    /**
      * The full commit ID of the commit that contains the content returned by GetFile.
      */
    var commitId: ObjectId
    /**
      * The base-64 encoded binary data object that represents the content of the file.
      */
    var fileContent: FileContent
    /**
      * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.  The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See below for a full list of supported return values. 
      */
    var fileMode: FileModeTypeEnum
    /**
      * The fully qualified path to the specified file. This returns the name and extension of the file.
      */
    var filePath: Path
    /**
      * The size of the contents of the file, in bytes.
      */
    var fileSize: ObjectSize
  }
  
  trait GetFolderInput extends js.Object {
    /**
      * A fully-qualified reference used to identify a commit that contains the version of the folder's content to return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no specifier is provided, the folder content will be returned as it exists in the HEAD commit.
      */
    var commitSpecifier: js.UndefOr[CommitName] = js.undefined
    /**
      * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example, /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of a repository. 
      */
    var folderPath: Path
    /**
      * The name of the repository.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetFolderOutput extends js.Object {
    /**
      * The full commit ID used as a reference for which version of the folder content is returned.
      */
    var commitId: ObjectId
    /**
      * The list of files that exist in the specified folder, if any.
      */
    var files: js.UndefOr[FileList] = js.undefined
    /**
      * The fully-qualified path of the folder whose contents are returned.
      */
    var folderPath: Path
    /**
      * The list of folders that exist beneath the specified folder, if any.
      */
    var subFolders: js.UndefOr[FolderList] = js.undefined
    /**
      * The list of submodules that exist in the specified folder, if any.
      */
    var subModules: js.UndefOr[SubModuleList] = js.undefined
    /**
      * The list of symbolic links to other files and folders that exist in the specified folder, if any.
      */
    var symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined
    /**
      * The full SHA-1 pointer of the tree information for the commit that contains the folder.
      */
    var treeId: js.UndefOr[ObjectId] = js.undefined
  }
  
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
  
  trait GetMergeConflictsOutput extends js.Object {
    /**
      * The commit ID of the destination commit specifier that was used in the merge evaluation.
      */
    var destinationCommitId: CommitId
    /**
      * A Boolean value that indicates whether the code is mergable by the specified merge option.
      */
    var mergeable: IsMergeable
    /**
      * The commit ID of the source commit specifier that was used in the merge evaluation.
      */
    var sourceCommitId: CommitId
  }
  
  trait GetPullRequestInput extends js.Object {
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
  }
  
  trait GetPullRequestOutput extends js.Object {
    /**
      * Information about the specified pull request.
      */
    var pullRequest: PullRequest
  }
  
  trait GetRepositoryInput extends js.Object {
    /**
      * The name of the repository to get information about.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetRepositoryOutput extends js.Object {
    /**
      * Information about the repository.
      */
    var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
  }
  
  trait GetRepositoryTriggersInput extends js.Object {
    /**
      * The name of the repository for which the trigger is configured.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetRepositoryTriggersOutput extends js.Object {
    /**
      * The system-generated unique ID for the trigger.
      */
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
    /**
      * The JSON block of configuration information for each trigger.
      */
    var triggers: js.UndefOr[RepositoryTriggersList] = js.undefined
  }
  
  trait ListBranchesInput extends js.Object {
    /**
      * An enumeration token that allows the operation to batch the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the repository that contains the branches.
      */
    var repositoryName: RepositoryName
  }
  
  trait ListBranchesOutput extends js.Object {
    /**
      * The list of branch names.
      */
    var branches: js.UndefOr[BranchNameList] = js.undefined
    /**
      * An enumeration token that returns the batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListPullRequestsInput extends js.Object {
    /**
      * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the results to pull requests created by that user.
      */
    var authorArn: js.UndefOr[Arn] = js.undefined
    /**
      * A non-negative integer used to limit the number of returned results.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the specified status.
      */
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    /**
      * The name of the repository for which you want to list pull requests.
      */
    var repositoryName: RepositoryName
  }
  
  trait ListPullRequestsOutput extends js.Object {
    /**
      * An enumeration token that when provided in a request, returns the next batch of the results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The system-generated IDs of the pull requests.
      */
    var pullRequestIds: PullRequestIdList
  }
  
  trait ListRepositoriesInput extends js.Object {
    /**
      * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The order in which to sort the results of a list repositories operation.
      */
    var order: js.UndefOr[OrderEnum] = js.undefined
    /**
      * The criteria used to sort the results of a list repositories operation.
      */
    var sortBy: js.UndefOr[SortByEnum] = js.undefined
  }
  
  trait ListRepositoriesOutput extends js.Object {
    /**
      * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Lists the repositories called by the list repositories operation.
      */
    var repositories: js.UndefOr[RepositoryNameIdPairList] = js.undefined
  }
  
  trait Location extends js.Object {
    /**
      * The name of the file being compared, including its extension and subdirectory, if any.
      */
    var filePath: js.UndefOr[Path] = js.undefined
    /**
      * The position of a change within a compared file, in line number format.
      */
    var filePosition: js.UndefOr[Position] = js.undefined
    /**
      * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.
      */
    var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.undefined
  }
  
  trait MergeMetadata extends js.Object {
    /**
      * A Boolean value indicating whether the merge has been made.
      */
    var isMerged: js.UndefOr[IsMerged] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the user who merged the branches.
      */
    var mergedBy: js.UndefOr[Arn] = js.undefined
  }
  
  trait MergePullRequestByFastForwardInput extends js.Object {
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
    var sourceCommitId: js.UndefOr[CommitId] = js.undefined
  }
  
  trait MergePullRequestByFastForwardOutput extends js.Object {
    /**
      * Information about the specified pull request, including information about the merge.
      */
    var pullRequest: js.UndefOr[PullRequest] = js.undefined
  }
  
  trait PostCommentForComparedCommitInput extends js.Object {
    /**
      * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
      */
    var afterCommitId: CommitId
    /**
      * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The content of the comment you want to make.
      */
    var content: Content
    /**
      * The location of the comparison where you want to comment.
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The name of the repository where you want to post a comment on the comparison between commits.
      */
    var repositoryName: RepositoryName
  }
  
  trait PostCommentForComparedCommitOutput extends js.Object {
    /**
      * In the directionality you established, the blob ID of the 'after' blob.
      */
    var afterBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * In the directionality you established, the full commit ID of the 'after' commit.
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * In the directionality you established, the blob ID of the 'before' blob.
      */
    var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * In the directionality you established, the full commit ID of the 'before' commit.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The content of the comment you posted.
      */
    var comment: js.UndefOr[Comment] = js.undefined
    /**
      * The location of the comment in the comparison between the two commits.
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The name of the repository where you posted a comment on the comparison between commits.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait PostCommentForPullRequestInput extends js.Object {
    /**
      * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request when you post the comment.
      */
    var afterCommitId: CommitId
    /**
      * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.
      */
    var beforeCommitId: CommitId
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The content of your comment on the change.
      */
    var content: Content
    /**
      * The location of the change where you want to post your comment. If no location is provided, the comment will be posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
    /**
      * The name of the repository where you want to post a comment on a pull request.
      */
    var repositoryName: RepositoryName
  }
  
  trait PostCommentForPullRequestOutput extends js.Object {
    /**
      * In the directionality of the pull request, the blob ID of the 'after' blob.
      */
    var afterBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The full commit ID of the commit in the destination branch where the pull request will be merged.
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * In the directionality of the pull request, the blob ID of the 'before' blob.
      */
    var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The content of the comment you posted.
      */
    var comment: js.UndefOr[Comment] = js.undefined
    /**
      * The location of the change where you posted your comment.
      */
    var location: js.UndefOr[Location] = js.undefined
    /**
      * The system-generated ID of the pull request. 
      */
    var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
    /**
      * The name of the repository where you posted a comment on a pull request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait PostCommentReplyInput extends js.Object {
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The contents of your reply to a comment.
      */
    var content: Content
    /**
      * The system-generated ID of the comment to which you want to reply. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
      */
    var inReplyTo: CommentId
  }
  
  trait PostCommentReplyOutput extends js.Object {
    /**
      * Information about the reply to a comment.
      */
    var comment: js.UndefOr[Comment] = js.undefined
  }
  
  trait PullRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user who created the pull request.
      */
    var authorArn: js.UndefOr[Arn] = js.undefined
    /**
      * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The date and time the pull request was originally created, in timestamp format.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The day and time of the last user or system activity on the pull request, in timestamp format.
      */
    var lastActivityDate: js.UndefOr[LastModifiedDate] = js.undefined
    /**
      * The system-generated ID of the pull request. 
      */
    var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
    /**
      * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
      */
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    /**
      * The targets of the pull request, including the source branch and destination branch for the pull request.
      */
    var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.undefined
    /**
      * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.
      */
    var title: js.UndefOr[Title] = js.undefined
  }
  
  trait PullRequestCreatedEventMetadata extends js.Object {
    /**
      * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
      */
    var destinationCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The commit ID of the most recent commit that the source branch and the destination branch have in common.
      */
    var mergeBase: js.UndefOr[CommitId] = js.undefined
    /**
      * The name of the repository where the pull request was created.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The commit ID on the source branch used when the pull request was created.
      */
    var sourceCommitId: js.UndefOr[CommitId] = js.undefined
  }
  
  trait PullRequestEvent extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.
      */
    var actorArn: js.UndefOr[Arn] = js.undefined
    /**
      * The day and time of the pull request event, in timestamp format.
      */
    var eventDate: js.UndefOr[EventDate] = js.undefined
    /**
      * Information about the source and destination branches for the pull request.
      */
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined
    /**
      * The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).
      */
    var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
    /**
      * The system-generated ID of the pull request.
      */
    var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
    /**
      * Information about the change in mergability state for the pull request event.
      */
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined
    /**
      * Information about the updated source branch for the pull request event. 
      */
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
    /**
      * Information about the change in status for the pull request event.
      */
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
  }
  
  trait PullRequestMergedStateChangedEventMetadata extends js.Object {
    /**
      * The name of the branch that the pull request will be merged into.
      */
    var destinationReference: js.UndefOr[ReferenceName] = js.undefined
    /**
      * Information about the merge state change event.
      */
    var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
    /**
      * The name of the repository where the pull request was created.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
    /**
      * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.
      */
    var afterCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.
      */
    var beforeCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The commit ID of the most recent commit that the source branch and the destination branch have in common.
      */
    var mergeBase: js.UndefOr[CommitId] = js.undefined
    /**
      * The name of the repository where the pull request was updated.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait PullRequestStatusChangedEventMetadata extends js.Object {
    /**
      * The changed status of the pull request.
      */
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
  }
  
  trait PullRequestTarget extends js.Object {
    /**
      * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.
      */
    var destinationCommit: js.UndefOr[CommitId] = js.undefined
    /**
      * The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. 
      */
    var destinationReference: js.UndefOr[ReferenceName] = js.undefined
    /**
      * The commit ID of the most recent commit that the source branch and the destination branch have in common.
      */
    var mergeBase: js.UndefOr[CommitId] = js.undefined
    /**
      * Returns metadata about the state of the merge, including whether the merge has been made.
      */
    var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
    /**
      * The name of the repository that contains the pull request source and destination branches.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
      */
    var sourceCommit: js.UndefOr[CommitId] = js.undefined
    /**
      * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
      */
    var sourceReference: js.UndefOr[ReferenceName] = js.undefined
  }
  
  trait PutFileEntry extends js.Object {
    /**
      * The content of the file, if a source file is not specified.
      */
    var fileContent: js.UndefOr[FileContent] = js.undefined
    /**
      * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
      */
    var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    /**
      * The full path to the file in the repository, including the name of the file.
      */
    var filePath: Path
    /**
      * The name and full path of the file that contains the changes you want to make as part of the commit, if you are not providing the file content directly.
      */
    var sourceFile: js.UndefOr[SourceFileSpecifier] = js.undefined
  }
  
  trait PutFileInput extends js.Object {
    /**
      * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will be created.
      */
    var branchName: BranchName
    /**
      * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in order to provide a more useful commit history for your repository.
      */
    var commitMessage: js.UndefOr[Message] = js.undefined
    /**
      * An email address for the person adding or updating the file.
      */
    var email: js.UndefOr[Email] = js.undefined
    /**
      * The content of the file, in binary object format. 
      */
    var fileContent: FileContent
    /**
      * The file mode permissions of the blob. Valid file mode permissions are listed below.
      */
    var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    /**
      * The name of the file you want to add or update, including the relative path to the file in the repository.  If the path does not currently exist in the repository, the path will be created as part of adding the file. 
      */
    var filePath: Path
    /**
      * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order to provide a more useful commit history for your repository.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required.  The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the file will not be added or updated.
      */
    var parentCommitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The name of the repository where you want to add or update the file.
      */
    var repositoryName: RepositoryName
  }
  
  trait PutFileOutput extends js.Object {
    /**
      * The ID of the blob, which is its SHA-1 pointer.
      */
    var blobId: ObjectId
    /**
      * The full SHA of the commit that contains this file change.
      */
    var commitId: ObjectId
    /**
      * The full SHA-1 pointer of the tree information for the commit that contains this file change.
      */
    var treeId: ObjectId
  }
  
  trait PutRepositoryTriggersInput extends js.Object {
    /**
      * The name of the repository where you want to create or update the trigger.
      */
    var repositoryName: RepositoryName
    /**
      * The JSON block of configuration information for each trigger.
      */
    var triggers: RepositoryTriggersList
  }
  
  trait PutRepositoryTriggersOutput extends js.Object {
    /**
      * The system-generated unique ID for the create or update operation.
      */
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
  }
  
  trait RepositoryMetadata extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the repository.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The ID of the AWS account associated with the repository.
      */
    var accountId: js.UndefOr[AccountId] = js.undefined
    /**
      * The URL to use for cloning the repository over HTTPS.
      */
    var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined
    /**
      * The URL to use for cloning the repository over SSH.
      */
    var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined
    /**
      * The date and time the repository was created, in timestamp format.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The repository's default branch name.
      */
    var defaultBranch: js.UndefOr[BranchName] = js.undefined
    /**
      * The date and time the repository was last modified, in timestamp format.
      */
    var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
    /**
      * A comment or description about the repository.
      */
    var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    /**
      * The ID of the repository.
      */
    var repositoryId: js.UndefOr[RepositoryId] = js.undefined
    /**
      * The repository's name.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait RepositoryNameIdPair extends js.Object {
    /**
      * The ID associated with the repository.
      */
    var repositoryId: js.UndefOr[RepositoryId] = js.undefined
    /**
      * The name associated with the repository.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait RepositoryTrigger extends js.Object {
    /**
      * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.  While no content is required in the array, you must include the array itself. 
      */
    var branches: js.UndefOr[BranchNameList] = js.undefined
    /**
      * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
      */
    var customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined
    /**
      * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
      */
    var destinationArn: Arn
    /**
      * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS).   The valid value "all" cannot be used with any other values. 
      */
    var events: RepositoryTriggerEventList
    /**
      * The name of the trigger.
      */
    var name: RepositoryTriggerName
  }
  
  trait RepositoryTriggerExecutionFailure extends js.Object {
    /**
      * Additional message information about the trigger that did not run.
      */
    var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined
    /**
      * The name of the trigger that did not run.
      */
    var trigger: js.UndefOr[RepositoryTriggerName] = js.undefined
  }
  
  trait SetFileModeEntry extends js.Object {
    /**
      * The file mode for the file.
      */
    var fileMode: FileModeTypeEnum
    /**
      * The full path to the file, including the name of the file.
      */
    var filePath: Path
  }
  
  trait SourceFileSpecifier extends js.Object {
    /**
      * The full path to the file, including the name of the file.
      */
    var filePath: Path
    /**
      * Whether to remove the source file from the parent commit.
      */
    var isMove: js.UndefOr[IsMove] = js.undefined
  }
  
  trait SubModule extends js.Object {
    /**
      * The fully qualified path to the folder that contains the reference to the submodule.
      */
    var absolutePath: js.UndefOr[Path] = js.undefined
    /**
      * The commit ID that contains the reference to the submodule.
      */
    var commitId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The relative path of the submodule from the folder where the query originated.
      */
    var relativePath: js.UndefOr[Path] = js.undefined
  }
  
  trait SymbolicLink extends js.Object {
    /**
      * The fully-qualified path to the folder that contains the symbolic link.
      */
    var absolutePath: js.UndefOr[Path] = js.undefined
    /**
      * The blob ID that contains the information about the symbolic link.
      */
    var blobId: js.UndefOr[ObjectId] = js.undefined
    /**
      * The file mode permissions of the blob that cotains information about the symbolic link.
      */
    var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    /**
      * The relative path of the symbolic link from the folder where the query originated.
      */
    var relativePath: js.UndefOr[Path] = js.undefined
  }
  
  trait Target extends js.Object {
    /**
      * The branch of the repository where the pull request changes will be merged into. Also known as the destination branch.
      */
    var destinationReference: js.UndefOr[ReferenceName] = js.undefined
    /**
      * The name of the repository that contains the pull request.
      */
    var repositoryName: RepositoryName
    /**
      * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
      */
    var sourceReference: ReferenceName
  }
  
  trait TestRepositoryTriggersInput extends js.Object {
    /**
      * The name of the repository in which to test the triggers.
      */
    var repositoryName: RepositoryName
    /**
      * The list of triggers to test.
      */
    var triggers: RepositoryTriggersList
  }
  
  trait TestRepositoryTriggersOutput extends js.Object {
    /**
      * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.
      */
    var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.undefined
    /**
      * The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.
      */
    var successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def batchGetRepositories(): awsDashSdkLib.libRequestMod.Request[BatchGetRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetRepositories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetRepositoriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def batchGetRepositories(params: BatchGetRepositoriesInput): awsDashSdkLib.libRequestMod.Request[BatchGetRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetRepositories(
      params: BatchGetRepositoriesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetRepositoriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
      */
    def createBranch(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBranch(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
      */
    def createBranch(params: CreateBranchInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBranch(
      params: CreateBranchInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a commit for a repository on the tip of a specified branch.
      */
    def createCommit(): awsDashSdkLib.libRequestMod.Request[CreateCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCommit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a commit for a repository on the tip of a specified branch.
      */
    def createCommit(params: CreateCommitInput): awsDashSdkLib.libRequestMod.Request[CreateCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCommit(
      params: CreateCommitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pull request in the specified repository.
      */
    def createPullRequest(): awsDashSdkLib.libRequestMod.Request[CreatePullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPullRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a pull request in the specified repository.
      */
    def createPullRequest(params: CreatePullRequestInput): awsDashSdkLib.libRequestMod.Request[CreatePullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPullRequest(
      params: CreatePullRequestInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty repository.
      */
    def createRepository(): awsDashSdkLib.libRequestMod.Request[CreateRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty repository.
      */
    def createRepository(params: CreateRepositoryInput): awsDashSdkLib.libRequestMod.Request[CreateRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRepository(
      params: CreateRepositoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
      */
    def deleteBranch(): awsDashSdkLib.libRequestMod.Request[DeleteBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBranch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBranchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
      */
    def deleteBranch(params: DeleteBranchInput): awsDashSdkLib.libRequestMod.Request[DeleteBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBranch(
      params: DeleteBranchInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBranchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the content of a comment made on a change, file, or commit in a repository.
      */
    def deleteCommentContent(): awsDashSdkLib.libRequestMod.Request[DeleteCommentContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCommentContent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCommentContentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCommentContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the content of a comment made on a change, file, or commit in a repository.
      */
    def deleteCommentContent(params: DeleteCommentContentInput): awsDashSdkLib.libRequestMod.Request[DeleteCommentContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCommentContent(
      params: DeleteCommentContentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCommentContentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCommentContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
      */
    def deleteFile(): awsDashSdkLib.libRequestMod.Request[DeleteFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
      */
    def deleteFile(params: DeleteFileInput): awsDashSdkLib.libRequestMod.Request[DeleteFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFile(
      params: DeleteFileInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
      */
    def deleteRepository(): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
      */
    def deleteRepository(params: DeleteRepositoryInput): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepository(
      params: DeleteRepositoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about one or more pull request events.
      */
    def describePullRequestEvents(): awsDashSdkLib.libRequestMod.Request[DescribePullRequestEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePullRequestEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePullRequestEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePullRequestEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about one or more pull request events.
      */
    def describePullRequestEvents(params: DescribePullRequestEventsInput): awsDashSdkLib.libRequestMod.Request[DescribePullRequestEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePullRequestEvents(
      params: DescribePullRequestEventsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePullRequestEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePullRequestEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the base-64 encoded content of an individual blob within a repository.
      */
    def getBlob(): awsDashSdkLib.libRequestMod.Request[GetBlobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBlob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBlobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBlobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the base-64 encoded content of an individual blob within a repository.
      */
    def getBlob(params: GetBlobInput): awsDashSdkLib.libRequestMod.Request[GetBlobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBlob(
      params: GetBlobInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBlobOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBlobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a repository branch, including its name and the last commit ID.
      */
    def getBranch(): awsDashSdkLib.libRequestMod.Request[GetBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBranch(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a repository branch, including its name and the last commit ID.
      */
    def getBranch(params: GetBranchInput): awsDashSdkLib.libRequestMod.Request[GetBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBranch(
      params: GetBranchInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBranchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the content of a comment made on a change, file, or commit in a repository.
      */
    def getComment(): awsDashSdkLib.libRequestMod.Request[GetCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getComment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the content of a comment made on a change, file, or commit in a repository.
      */
    def getComment(params: GetCommentInput): awsDashSdkLib.libRequestMod.Request[GetCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getComment(
      params: GetCommentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about comments made on the comparison between two commits.
      */
    def getCommentsForComparedCommit(): awsDashSdkLib.libRequestMod.Request[GetCommentsForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommentsForComparedCommit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentsForComparedCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentsForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about comments made on the comparison between two commits.
      */
    def getCommentsForComparedCommit(params: GetCommentsForComparedCommitInput): awsDashSdkLib.libRequestMod.Request[GetCommentsForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommentsForComparedCommit(
      params: GetCommentsForComparedCommitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentsForComparedCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentsForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns comments made on a pull request.
      */
    def getCommentsForPullRequest(): awsDashSdkLib.libRequestMod.Request[GetCommentsForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommentsForPullRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentsForPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentsForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns comments made on a pull request.
      */
    def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): awsDashSdkLib.libRequestMod.Request[GetCommentsForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommentsForPullRequest(
      params: GetCommentsForPullRequestInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCommentsForPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCommentsForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a commit, including commit message and committer information.
      */
    def getCommit(): awsDashSdkLib.libRequestMod.Request[GetCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommit(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetCommitOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a commit, including commit message and committer information.
      */
    def getCommit(params: GetCommitInput): awsDashSdkLib.libRequestMod.Request[GetCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCommit(
      params: GetCommitInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetCommitOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
      */
    def getDifferences(): awsDashSdkLib.libRequestMod.Request[GetDifferencesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDifferences(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDifferencesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDifferencesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
      */
    def getDifferences(params: GetDifferencesInput): awsDashSdkLib.libRequestMod.Request[GetDifferencesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDifferences(
      params: GetDifferencesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDifferencesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDifferencesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the base-64 encoded contents of a specified file and its metadata.
      */
    def getFile(): awsDashSdkLib.libRequestMod.Request[GetFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetFileOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the base-64 encoded contents of a specified file and its metadata.
      */
    def getFile(params: GetFileInput): awsDashSdkLib.libRequestMod.Request[GetFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFile(
      params: GetFileInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetFileOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the contents of a specified folder in a repository.
      */
    def getFolder(): awsDashSdkLib.libRequestMod.Request[GetFolderOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetFolderOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the contents of a specified folder in a repository.
      */
    def getFolder(params: GetFolderInput): awsDashSdkLib.libRequestMod.Request[GetFolderOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFolder(
      params: GetFolderInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetFolderOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetFolderOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
      */
    def getMergeConflicts(): awsDashSdkLib.libRequestMod.Request[GetMergeConflictsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMergeConflicts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMergeConflictsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMergeConflictsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
      */
    def getMergeConflicts(params: GetMergeConflictsInput): awsDashSdkLib.libRequestMod.Request[GetMergeConflictsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMergeConflicts(
      params: GetMergeConflictsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMergeConflictsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMergeConflictsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a pull request in a specified repository.
      */
    def getPullRequest(): awsDashSdkLib.libRequestMod.Request[GetPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPullRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a pull request in a specified repository.
      */
    def getPullRequest(params: GetPullRequestInput): awsDashSdkLib.libRequestMod.Request[GetPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPullRequest(
      params: GetPullRequestInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def getRepository(): awsDashSdkLib.libRequestMod.Request[GetRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def getRepository(params: GetRepositoryInput): awsDashSdkLib.libRequestMod.Request[GetRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepository(
      params: GetRepositoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about triggers configured for a repository.
      */
    def getRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[GetRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepositoryTriggers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about triggers configured for a repository.
      */
    def getRepositoryTriggers(params: GetRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[GetRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepositoryTriggers(
      params: GetRepositoryTriggersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more branches in a repository.
      */
    def listBranches(): awsDashSdkLib.libRequestMod.Request[ListBranchesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBranches(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBranchesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBranchesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more branches in a repository.
      */
    def listBranches(params: ListBranchesInput): awsDashSdkLib.libRequestMod.Request[ListBranchesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBranches(
      params: ListBranchesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBranchesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBranchesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
      */
    def listPullRequests(): awsDashSdkLib.libRequestMod.Request[ListPullRequestsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPullRequests(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPullRequestsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPullRequestsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
      */
    def listPullRequests(params: ListPullRequestsInput): awsDashSdkLib.libRequestMod.Request[ListPullRequestsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPullRequests(
      params: ListPullRequestsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPullRequestsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPullRequestsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more repositories.
      */
    def listRepositories(): awsDashSdkLib.libRequestMod.Request[ListRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRepositories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRepositoriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more repositories.
      */
    def listRepositories(params: ListRepositoriesInput): awsDashSdkLib.libRequestMod.Request[ListRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRepositories(
      params: ListRepositoriesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRepositoriesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRepositoriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
      */
    def mergePullRequestByFastForward(): awsDashSdkLib.libRequestMod.Request[MergePullRequestByFastForwardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergePullRequestByFastForward(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MergePullRequestByFastForwardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MergePullRequestByFastForwardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
      */
    def mergePullRequestByFastForward(params: MergePullRequestByFastForwardInput): awsDashSdkLib.libRequestMod.Request[MergePullRequestByFastForwardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergePullRequestByFastForward(
      params: MergePullRequestByFastForwardInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MergePullRequestByFastForwardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MergePullRequestByFastForwardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment on the comparison between two commits.
      */
    def postCommentForComparedCommit(): awsDashSdkLib.libRequestMod.Request[PostCommentForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentForComparedCommit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentForComparedCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment on the comparison between two commits.
      */
    def postCommentForComparedCommit(params: PostCommentForComparedCommitInput): awsDashSdkLib.libRequestMod.Request[PostCommentForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentForComparedCommit(
      params: PostCommentForComparedCommitInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentForComparedCommitOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentForComparedCommitOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment on a pull request.
      */
    def postCommentForPullRequest(): awsDashSdkLib.libRequestMod.Request[PostCommentForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentForPullRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentForPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment on a pull request.
      */
    def postCommentForPullRequest(params: PostCommentForPullRequestInput): awsDashSdkLib.libRequestMod.Request[PostCommentForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentForPullRequest(
      params: PostCommentForPullRequestInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentForPullRequestOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentForPullRequestOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
      */
    def postCommentReply(): awsDashSdkLib.libRequestMod.Request[PostCommentReplyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentReply(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentReplyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentReplyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
      */
    def postCommentReply(params: PostCommentReplyInput): awsDashSdkLib.libRequestMod.Request[PostCommentReplyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def postCommentReply(
      params: PostCommentReplyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PostCommentReplyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PostCommentReplyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
      */
    def putFile(): awsDashSdkLib.libRequestMod.Request[PutFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putFile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutFileOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
      */
    def putFile(params: PutFileInput): awsDashSdkLib.libRequestMod.Request[PutFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putFile(
      params: PutFileInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutFileOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutFileOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces all triggers for a repository. This can be used to create or delete triggers.
      */
    def putRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[PutRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRepositoryTriggers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces all triggers for a repository. This can be used to create or delete triggers.
      */
    def putRepositoryTriggers(params: PutRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[PutRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRepositoryTriggers(
      params: PutRepositoryTriggersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
      */
    def testRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[TestRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testRepositoryTriggers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
      */
    def testRepositoryTriggers(params: TestRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[TestRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testRepositoryTriggers(
      params: TestRepositoryTriggersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestRepositoryTriggersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestRepositoryTriggersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the contents of a comment.
      */
    def updateComment(): awsDashSdkLib.libRequestMod.Request[UpdateCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateComment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCommentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the contents of a comment.
      */
    def updateComment(params: UpdateCommentInput): awsDashSdkLib.libRequestMod.Request[UpdateCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateComment(
      params: UpdateCommentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCommentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCommentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
      */
    def updateDefaultBranch(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDefaultBranch(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
      */
    def updateDefaultBranch(params: UpdateDefaultBranchInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDefaultBranch(
      params: UpdateDefaultBranchInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the contents of the description of a pull request.
      */
    def updatePullRequestDescription(): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestDescriptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestDescription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestDescriptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestDescriptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the contents of the description of a pull request.
      */
    def updatePullRequestDescription(params: UpdatePullRequestDescriptionInput): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestDescriptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestDescription(
      params: UpdatePullRequestDescriptionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestDescriptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestDescriptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of a pull request. 
      */
    def updatePullRequestStatus(): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of a pull request. 
      */
    def updatePullRequestStatus(params: UpdatePullRequestStatusInput): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestStatus(
      params: UpdatePullRequestStatusInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the title of a pull request.
      */
    def updatePullRequestTitle(): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestTitleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestTitle(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestTitleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestTitleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the title of a pull request.
      */
    def updatePullRequestTitle(params: UpdatePullRequestTitleInput): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestTitleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePullRequestTitle(
      params: UpdatePullRequestTitleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePullRequestTitleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePullRequestTitleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def updateRepositoryDescription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRepositoryDescription(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
      */
    def updateRepositoryDescription(params: UpdateRepositoryDescriptionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRepositoryDescription(
      params: UpdateRepositoryDescriptionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
      */
    def updateRepositoryName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRepositoryName(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
      */
    def updateRepositoryName(params: UpdateRepositoryNameInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRepositoryName(
      params: UpdateRepositoryNameInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateCommentInput extends js.Object {
    /**
      * The system-generated ID of the comment you want to update. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
      */
    var commentId: CommentId
    /**
      * The updated content with which you want to replace the existing content of the comment.
      */
    var content: Content
  }
  
  trait UpdateCommentOutput extends js.Object {
    /**
      * Information about the updated comment.
      */
    var comment: js.UndefOr[Comment] = js.undefined
  }
  
  trait UpdateDefaultBranchInput extends js.Object {
    /**
      * The name of the branch to set as the default.
      */
    var defaultBranchName: BranchName
    /**
      * The name of the repository to set or change the default branch for.
      */
    var repositoryName: RepositoryName
  }
  
  trait UpdatePullRequestDescriptionInput extends js.Object {
    /**
      * The updated content of the description for the pull request. This content will replace the existing description.
      */
    var description: Description
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
  }
  
  trait UpdatePullRequestDescriptionOutput extends js.Object {
    /**
      * Information about the updated pull request.
      */
    var pullRequest: PullRequest
  }
  
  trait UpdatePullRequestStatusInput extends js.Object {
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
    /**
      * The status of the pull request. The only valid operations are to update the status from OPEN to OPEN, OPEN to CLOSED or from from CLOSED to CLOSED.
      */
    var pullRequestStatus: PullRequestStatusEnum
  }
  
  trait UpdatePullRequestStatusOutput extends js.Object {
    /**
      * Information about the pull request.
      */
    var pullRequest: PullRequest
  }
  
  trait UpdatePullRequestTitleInput extends js.Object {
    /**
      * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
      */
    var pullRequestId: PullRequestId
    /**
      * The updated title of the pull request. This will replace the existing title.
      */
    var title: Title
  }
  
  trait UpdatePullRequestTitleOutput extends js.Object {
    /**
      * Information about the updated pull request.
      */
    var pullRequest: PullRequest
  }
  
  trait UpdateRepositoryDescriptionInput extends js.Object {
    /**
      * The new comment or description for the specified repository. Repository descriptions are limited to 1,000 characters.
      */
    var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    /**
      * The name of the repository to set or change the comment or description for.
      */
    var repositoryName: RepositoryName
  }
  
  trait UpdateRepositoryNameInput extends js.Object {
    /**
      * The new name for the repository.
      */
    var newName: RepositoryName
    /**
      * The existing name of the repository.
      */
    var oldName: RepositoryName
  }
  
  trait UserInfo extends js.Object {
    /**
      * The date when the specified commit was commited, in timestamp format with GMT offset.
      */
    var date: js.UndefOr[_Date] = js.undefined
    /**
      * The email address associated with the user who made the commit, if any.
      */
    var email: js.UndefOr[Email] = js.undefined
    /**
      * The name of the user who made the specified commit.
      */
    var name: js.UndefOr[Name] = js.undefined
  }
  
  trait _ChangeTypeEnum extends js.Object
  
  trait _FileModeTypeEnum extends js.Object
  
  trait _OrderEnum extends js.Object
  
  trait _PullRequestEventType extends js.Object
  
  trait _PullRequestStatusEnum extends js.Object
  
  trait _RelativeFileVersionEnum extends js.Object
  
  trait _RepositoryTriggerEventEnum extends js.Object
  
  trait _SortByEnum extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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
  type FileContent = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsCodecommitMod.Blob | java.lang.String
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
  type SetFileModeEntries = js.Array[SetFileModeEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.repositoryName
    - awsDashSdkLib.awsDashSdkLibStrings.lastModifiedDate
    - java.lang.String
  */
  type SortByEnum = _SortByEnum | java.lang.String
  type SubModuleList = js.Array[SubModule]
  type SymbolicLinkList = js.Array[SymbolicLink]
  type TargetList = js.Array[Target]
  type Title = java.lang.String
  type _Date = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-13`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsCodecommitMod.Blob | java.lang.String
}

