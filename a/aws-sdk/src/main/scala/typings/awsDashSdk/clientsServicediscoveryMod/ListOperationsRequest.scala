package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsRequest extends js.Object {
  /**
    * A complex type that contains specifications for the operations that you want to list, for example, operations that you started between a specified start date and end date. If you specify more than one filter, an operation must match all filters to be returned by ListOperations.
    */
  var Filters: js.UndefOr[OperationFilters] = js.undefined
  /**
    * The maximum number of items that you want AWS Cloud Map to return in the response to a ListOperations request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 operations.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  /**
    * For the first ListOperations request, omit this value. If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}

object ListOperationsRequest {
  @scala.inline
  def apply(Filters: OperationFilters = null, MaxResults: Int | Double = null, NextToken: NextToken = null): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListOperationsRequest]
  }
}

