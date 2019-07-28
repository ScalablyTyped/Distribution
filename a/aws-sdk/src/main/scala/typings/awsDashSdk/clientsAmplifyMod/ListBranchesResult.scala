package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBranchesResult extends js.Object {
  /**
    *  List of branches for an Amplify App. 
    */
  var branches: Branches
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBranchesResult {
  @scala.inline
  def apply(branches: Branches, nextToken: NextToken = null): ListBranchesResult = {
    val __obj = js.Dynamic.literal(branches = branches)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBranchesResult]
  }
}

