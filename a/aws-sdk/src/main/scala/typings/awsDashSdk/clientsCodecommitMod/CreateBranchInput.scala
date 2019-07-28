package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object CreateBranchInput {
  @scala.inline
  def apply(branchName: BranchName, commitId: CommitId, repositoryName: RepositoryName): CreateBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName, commitId = commitId, repositoryName = repositoryName)
  
    __obj.asInstanceOf[CreateBranchInput]
  }
}

