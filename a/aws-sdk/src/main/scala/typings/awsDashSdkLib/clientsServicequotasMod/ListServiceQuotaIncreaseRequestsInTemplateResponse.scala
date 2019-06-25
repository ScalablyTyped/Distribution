package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends js.Object {
  /**
    * If present in the response, this value indicates there's more output available that what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns the list of values of the quota increase request in the template.
    */
  var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList] = js.undefined
}

object ListServiceQuotaIncreaseRequestsInTemplateResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ServiceQuotaIncreaseRequestInTemplateList: ServiceQuotaIncreaseRequestInTemplateList = null
  ): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceQuotaIncreaseRequestInTemplateList != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplateList")(ServiceQuotaIncreaseRequestInTemplateList)
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateResponse]
  }
}

