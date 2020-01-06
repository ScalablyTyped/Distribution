package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesInput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository that contains the branches.
    */
  var repositoryName: RepositoryName = js.native
}

object ListBranchesInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, nextToken: NextToken = null): ListBranchesInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesInput]
  }
}

