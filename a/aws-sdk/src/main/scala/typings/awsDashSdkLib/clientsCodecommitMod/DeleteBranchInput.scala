package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object DeleteBranchInput {
  @scala.inline
  def apply(branchName: BranchName, repositoryName: RepositoryName): DeleteBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName, repositoryName = repositoryName)
  
    __obj.asInstanceOf[DeleteBranchInput]
  }
}

