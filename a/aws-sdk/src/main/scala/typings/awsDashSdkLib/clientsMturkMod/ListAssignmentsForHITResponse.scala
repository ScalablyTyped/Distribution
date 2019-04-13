package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssignmentsForHITResponse extends js.Object {
  /**
    *  The collection of Assignment data structures returned by this call.
    */
  var Assignments: js.UndefOr[AssignmentList] = js.undefined
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}

object ListAssignmentsForHITResponse {
  @scala.inline
  def apply(
    Assignments: AssignmentList = null,
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined
  ): ListAssignmentsForHITResponse = {
    val __obj = js.Dynamic.literal()
    if (Assignments != null) __obj.updateDynamic("Assignments")(Assignments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults)
    __obj.asInstanceOf[ListAssignmentsForHITResponse]
  }
}

