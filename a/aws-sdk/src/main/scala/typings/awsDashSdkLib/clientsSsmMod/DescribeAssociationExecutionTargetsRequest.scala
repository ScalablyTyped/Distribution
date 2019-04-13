package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssociationExecutionTargetsRequest extends js.Object {
  /**
    * The association ID that includes the execution for which you want to view details.
    */
  var AssociationId: awsDashSdkLib.clientsSsmMod.AssociationId
  /**
    * The execution ID for which you want to view details.
    */
  var ExecutionId: AssociationExecutionId
  /**
    * Filters for the request. You can specify the following filters and values. Status (EQUAL) ResourceId (EQUAL) ResourceType (EQUAL)
    */
  var Filters: js.UndefOr[AssociationExecutionTargetsFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAssociationExecutionTargetsRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId,
    ExecutionId: AssociationExecutionId,
    Filters: AssociationExecutionTargetsFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeAssociationExecutionTargetsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId, ExecutionId = ExecutionId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsRequest]
  }
}

