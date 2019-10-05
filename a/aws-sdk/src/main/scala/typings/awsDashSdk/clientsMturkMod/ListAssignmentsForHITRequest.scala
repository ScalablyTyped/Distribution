package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssignmentsForHITRequest extends js.Object {
  /**
    * The status of the assignments to return: Submitted | Approved | Rejected
    */
  var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined
  /**
    * The ID of the HIT.
    */
  var HITId: EntityId
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssignmentsForHITRequest {
  @scala.inline
  def apply(
    HITId: EntityId,
    AssignmentStatuses: AssignmentStatusList = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null
  ): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId)
    if (AssignmentStatuses != null) __obj.updateDynamic("AssignmentStatuses")(AssignmentStatuses)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
}

