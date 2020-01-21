package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesResult extends js.Object {
  /**
    *  List of branches for an Amplify App. 
    */
  var branches: Branches = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBranchesResult {
  @scala.inline
  def apply(branches: Branches, nextToken: NextToken = null): ListBranchesResult = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesResult]
  }
}

