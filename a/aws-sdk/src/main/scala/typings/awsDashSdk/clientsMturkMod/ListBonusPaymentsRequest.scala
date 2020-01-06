package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBonusPaymentsRequest extends js.Object {
  /**
    * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  /**
    * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be specified
    */
  var HITId: js.UndefOr[EntityId] = js.native
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListBonusPaymentsRequest {
  @scala.inline
  def apply(
    AssignmentId: EntityId = null,
    HITId: EntityId = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null
  ): ListBonusPaymentsRequest = {
    val __obj = js.Dynamic.literal()
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId.asInstanceOf[js.Any])
    if (HITId != null) __obj.updateDynamic("HITId")(HITId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBonusPaymentsRequest]
  }
}

