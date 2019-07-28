package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsResponse extends js.Object {
  /**
    * If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  /**
    * Summary information about the operations that match the specified criteria.
    */
  var Operations: js.UndefOr[OperationSummaryList] = js.undefined
}

object ListOperationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Operations: OperationSummaryList = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Operations != null) __obj.updateDynamic("Operations")(Operations)
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

