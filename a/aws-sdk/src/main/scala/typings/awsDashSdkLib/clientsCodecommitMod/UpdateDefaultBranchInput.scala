package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object UpdateDefaultBranchInput {
  @scala.inline
  def apply(defaultBranchName: BranchName, repositoryName: RepositoryName): UpdateDefaultBranchInput = {
    val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName, repositoryName = repositoryName)
  
    __obj.asInstanceOf[UpdateDefaultBranchInput]
  }
}

