package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssociationExecutionsRequest extends js.Object {
  /**
    * The association ID for which you want to view execution history details.
    */
  var AssociationId: awsDashSdkLib.clientsSsmMod.AssociationId
  /**
    * Filters for the request. You can specify the following filters and values. ExecutionId (EQUAL) Status (EQUAL) CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
    */
  var Filters: js.UndefOr[AssociationExecutionFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAssociationExecutionsRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId,
    Filters: AssociationExecutionFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeAssociationExecutionsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAssociationExecutionsRequest]
  }
}

