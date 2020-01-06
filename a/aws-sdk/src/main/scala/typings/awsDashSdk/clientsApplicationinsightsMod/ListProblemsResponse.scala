package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProblemsResponse extends js.Object {
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of problems. 
    */
  var ProblemList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ProblemList] = js.native
}

object ListProblemsResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, ProblemList: ProblemList = null): ListProblemsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProblemList != null) __obj.updateDynamic("ProblemList")(ProblemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProblemsResponse]
  }
}

