package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ListBranchesInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, nextToken: NextToken = null): ListBranchesInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBranchesInput]
  }
}

