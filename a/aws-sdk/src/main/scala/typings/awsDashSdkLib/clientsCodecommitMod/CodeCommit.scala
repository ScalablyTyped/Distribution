package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCommit
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeCommit: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

