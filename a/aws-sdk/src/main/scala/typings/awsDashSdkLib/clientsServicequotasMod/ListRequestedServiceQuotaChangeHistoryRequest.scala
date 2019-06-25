package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRequestedServiceQuotaChangeHistoryRequest extends js.Object {
  /**
    * (Optional) Limits the number of results that you want to include in the response. If you don't include this parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond the specified maximum, the NextToken element is present and has a value (isn't null). Include that value as the NextToken request parameter in the call to the operation to get the next part of the results. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[ServiceCode] = js.undefined
  /**
    * Specifies the status value of the quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.undefined
}

object ListRequestedServiceQuotaChangeHistoryRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ServiceCode: ServiceCode = null,
    Status: RequestStatus = null
  ): ListRequestedServiceQuotaChangeHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryRequest]
  }
}

