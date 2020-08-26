package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesResult extends js.Object {
  /**
    *  A list of branches for an Amplify app. 
    */
  var branches: Branches = js.native
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBranchesResult {
  @scala.inline
  def apply(branches: Branches): ListBranchesResult = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesResult]
  }
  @scala.inline
  implicit class ListBranchesResultOps[Self <: ListBranchesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranchesVarargs(value: Branch*): Self = this.set("branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: Branches): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

