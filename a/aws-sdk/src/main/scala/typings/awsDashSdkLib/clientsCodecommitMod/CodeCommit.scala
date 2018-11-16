package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCommit
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeCommit: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ClientConfiguration = js.native
  /**
     * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def batchGetRepositories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def batchGetRepositories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def batchGetRepositories(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more repositories.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def batchGetRepositories(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.BatchGetRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
     */
  def createBranch(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
     */
  def createBranch(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
     */
  def createBranch(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateBranchInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a new branch in a repository and points the branch to a commit.  Calling the create branch operation does not set a repository's default branch. To do this, call the update default branch operation. 
     */
  def createBranch(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateBranchInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a pull request in the specified repository.
     */
  def createPullRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a pull request in the specified repository.
     */
  def createPullRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a pull request in the specified repository.
     */
  def createPullRequest(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a pull request in the specified repository.
     */
  def createPullRequest(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreatePullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new, empty repository.
     */
  def createRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new, empty repository.
     */
  def createRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new, empty repository.
     */
  def createRepository(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new, empty repository.
     */
  def createRepository(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.CreateRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
     */
  def deleteBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
     */
  def deleteBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
     */
  def deleteBranch(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a branch from a repository, unless that branch is the default branch for the repository. 
     */
  def deleteBranch(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     */
  def deleteCommentContent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     */
  def deleteCommentContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     */
  def deleteCommentContent(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     */
  def deleteCommentContent(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteCommentContentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
     */
  def deleteFile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
     */
  def deleteFile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
     */
  def deleteFile(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision. The file will still exist in the commits prior to the commit that contains the deletion.
     */
  def deleteFile(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
     */
  def deleteRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
     */
  def deleteRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
     */
  def deleteRepository(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.  Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future push calls to the deleted repository will fail. 
     */
  def deleteRepository(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DeleteRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more pull request events.
     */
  def describePullRequestEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more pull request events.
     */
  def describePullRequestEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more pull request events.
     */
  def describePullRequestEvents(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about one or more pull request events.
     */
  def describePullRequestEvents(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.DescribePullRequestEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded content of an individual blob within a repository.
     */
  def getBlob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded content of an individual blob within a repository.
     */
  def getBlob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded content of an individual blob within a repository.
     */
  def getBlob(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded content of an individual blob within a repository.
     */
  def getBlob(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBlobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository branch, including its name and the last commit ID.
     */
  def getBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository branch, including its name and the last commit ID.
     */
  def getBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository branch, including its name and the last commit ID.
     */
  def getBranch(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository branch, including its name and the last commit ID.
     */
  def getBranch(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetBranchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the content of a comment made on a change, file, or commit in a repository.
     */
  def getComment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the content of a comment made on a change, file, or commit in a repository.
     */
  def getComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the content of a comment made on a change, file, or commit in a repository.
     */
  def getComment(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the content of a comment made on a change, file, or commit in a repository.
     */
  def getComment(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about comments made on the comparison between two commits.
     */
  def getCommentsForComparedCommit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about comments made on the comparison between two commits.
     */
  def getCommentsForComparedCommit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about comments made on the comparison between two commits.
     */
  def getCommentsForComparedCommit(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about comments made on the comparison between two commits.
     */
  def getCommentsForComparedCommit(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns comments made on a pull request.
     */
  def getCommentsForPullRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns comments made on a pull request.
     */
  def getCommentsForPullRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns comments made on a pull request.
     */
  def getCommentsForPullRequest(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns comments made on a pull request.
     */
  def getCommentsForPullRequest(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommentsForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a commit, including commit message and committer information.
     */
  def getCommit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a commit, including commit message and committer information.
     */
  def getCommit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a commit, including commit message and committer information.
     */
  def getCommit(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a commit, including commit message and committer information.
     */
  def getCommit(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
     */
  def getDifferences(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
     */
  def getDifferences(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
     */
  def getDifferences(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or other fully qualified reference). Results can be limited to a specified path.
     */
  def getDifferences(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetDifferencesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded contents of a specified file and its metadata.
     */
  def getFile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded contents of a specified file and its metadata.
     */
  def getFile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded contents of a specified file and its metadata.
     */
  def getFile(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the base-64 encoded contents of a specified file and its metadata.
     */
  def getFile(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the contents of a specified folder in a repository.
     */
  def getFolder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the contents of a specified folder in a repository.
     */
  def getFolder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the contents of a specified folder in a repository.
     */
  def getFolder(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the contents of a specified folder in a repository.
     */
  def getFolder(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetFolderOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
     */
  def getMergeConflicts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
     */
  def getMergeConflicts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
     */
  def getMergeConflicts(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a repository.
     */
  def getMergeConflicts(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetMergeConflictsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a pull request in a specified repository.
     */
  def getPullRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a pull request in a specified repository.
     */
  def getPullRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a pull request in a specified repository.
     */
  def getPullRequest(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a pull request in a specified repository.
     */
  def getPullRequest(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def getRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def getRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def getRepository(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def getRepository(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about triggers configured for a repository.
     */
  def getRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about triggers configured for a repository.
     */
  def getRepositoryTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about triggers configured for a repository.
     */
  def getRepositoryTriggers(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about triggers configured for a repository.
     */
  def getRepositoryTriggers(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.GetRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more branches in a repository.
     */
  def listBranches(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more branches in a repository.
     */
  def listBranches(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more branches in a repository.
     */
  def listBranches(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more branches in a repository.
     */
  def listBranches(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListBranchesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
     */
  def listPullRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
     */
  def listPullRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
     */
  def listPullRequests(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status or pull request author ARN.
     */
  def listPullRequests(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListPullRequestsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more repositories.
     */
  def listRepositories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more repositories.
     */
  def listRepositories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more repositories.
     */
  def listRepositories(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more repositories.
     */
  def listRepositories(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.ListRepositoriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
     */
  def mergePullRequestByFastForward(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
     */
  def mergePullRequestByFastForward(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
     */
  def mergePullRequestByFastForward(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination branch for that pull request at the specified commit using the fast-forward merge option.
     */
  def mergePullRequestByFastForward(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.MergePullRequestByFastForwardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on the comparison between two commits.
     */
  def postCommentForComparedCommit(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on the comparison between two commits.
     */
  def postCommentForComparedCommit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on the comparison between two commits.
     */
  def postCommentForComparedCommit(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on the comparison between two commits.
     */
  def postCommentForComparedCommit(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForComparedCommitOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on a pull request.
     */
  def postCommentForPullRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on a pull request.
     */
  def postCommentForPullRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on a pull request.
     */
  def postCommentForPullRequest(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment on a pull request.
     */
  def postCommentForPullRequest(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentForPullRequestOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     */
  def postCommentReply(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     */
  def postCommentReply(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     */
  def postCommentReply(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     */
  def postCommentReply(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PostCommentReplyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
     */
  def putFile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
     */
  def putFile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
     */
  def putFile(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in the specified branch.
     */
  def putFile(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutFileOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     */
  def putRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     */
  def putRepositoryTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     */
  def putRepositoryTriggers(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     */
  def putRepositoryTriggers(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.PutRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
     */
  def testRepositoryTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
     */
  def testRepositoryTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
     */
  def testRepositoryTriggers(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is available in the repository, the test will send data from the last commit. If no data is available, sample data will be generated.
     */
  def testRepositoryTriggers(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.TestRepositoryTriggersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of a comment.
     */
  def updateComment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of a comment.
     */
  def updateComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of a comment.
     */
  def updateComment(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of a comment.
     */
  def updateComment(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateCommentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
     */
  def updateDefaultBranch(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
     */
  def updateDefaultBranch(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
     */
  def updateDefaultBranch(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateDefaultBranchInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the default branch name for the specified repository.  If you use this operation to change the default branch name to the current default branch name, a success message is returned even though the default branch did not change. 
     */
  def updateDefaultBranch(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateDefaultBranchInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the contents of the description of a pull request.
     */
  def updatePullRequestDescription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of the description of a pull request.
     */
  def updatePullRequestDescription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of the description of a pull request.
     */
  def updatePullRequestDescription(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the contents of the description of a pull request.
     */
  def updatePullRequestDescription(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestDescriptionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the status of a pull request. 
     */
  def updatePullRequestStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the status of a pull request. 
     */
  def updatePullRequestStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the status of a pull request. 
     */
  def updatePullRequestStatus(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the status of a pull request. 
     */
  def updatePullRequestStatus(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the title of a pull request.
     */
  def updatePullRequestTitle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the title of a pull request.
     */
  def updatePullRequestTitle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the title of a pull request.
     */
  def updatePullRequestTitle(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Replaces the title of a pull request.
     */
  def updatePullRequestTitle(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdatePullRequestTitleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def updateRepositoryDescription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def updateRepositoryDescription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def updateRepositoryDescription(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateRepositoryDescriptionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets or changes the comment or description for a repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
     */
  def updateRepositoryDescription(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateRepositoryDescriptionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
     */
  def updateRepositoryName(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
     */
  def updateRepositoryName(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
     */
  def updateRepositoryName(params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateRepositoryNameInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix ".git" is prohibited. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide.
     */
  def updateRepositoryName(
    params: awsDashSdkLib.clientsCodecommitMod.CodeCommitNs.UpdateRepositoryNameInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

