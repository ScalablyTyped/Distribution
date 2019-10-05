package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackSetOperationResultsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.MaxResults] = js.undefined
  /**
    * If the previous request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSetOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * The ID of the stack set operation.
    */
  var OperationId: ClientRequestToken
  /**
    * The name or unique ID of the stack set that you want to get operation results for.
    */
  var StackSetName: typings.awsDashSdk.clientsCloudformationMod.StackSetName
}

object ListStackSetOperationResultsInput {
  @scala.inline
  def apply(
    OperationId: ClientRequestToken,
    StackSetName: StackSetName,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListStackSetOperationResultsInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId, StackSetName = StackSetName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListStackSetOperationResultsInput]
  }
}

