package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceQuotaIncreaseRequestsInTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * (Optional) Limits the number of results that you want to include in the response. If you don't include this parameter, the response defaults to a value that's specific to the operation. If additional items exist beyond the specified maximum, the NextToken element is present and has a value (isn't null). Include that value as the NextToken request parameter in the call to the operation to get the next part of the results. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The identifier for a service. When performing an operation, use the ServiceCode to specify a particular service. 
    */
  var ServiceCode: js.UndefOr[ServiceCode] = js.undefined
}

object ListServiceQuotaIncreaseRequestsInTemplateRequest {
  @scala.inline
  def apply(
    AwsRegion: AwsRegion = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ServiceCode: ServiceCode = null
  ): ListServiceQuotaIncreaseRequestsInTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateRequest]
  }
}

