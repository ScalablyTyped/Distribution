package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUniqueProblemsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the unique problems. Allowed values include:   PENDING: A pending condition.   PASSED: A passing condition.   WARNED: A warning condition.   FAILED: A failed condition.   SKIPPED: A skipped condition.   ERRORED: An error condition.   STOPPED: A stopped condition.  
    */
  var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.undefined
}

object ListUniqueProblemsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, uniqueProblems: UniqueProblemsByExecutionResultMap = null): ListUniqueProblemsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (uniqueProblems != null) __obj.updateDynamic("uniqueProblems")(uniqueProblems)
    __obj.asInstanceOf[ListUniqueProblemsResult]
  }
}

