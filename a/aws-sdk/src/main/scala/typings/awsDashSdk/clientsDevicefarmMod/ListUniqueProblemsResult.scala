package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUniqueProblemsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the unique problems. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.native
}

object ListUniqueProblemsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, uniqueProblems: UniqueProblemsByExecutionResultMap = null): ListUniqueProblemsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (uniqueProblems != null) __obj.updateDynamic("uniqueProblems")(uniqueProblems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUniqueProblemsResult]
  }
}

