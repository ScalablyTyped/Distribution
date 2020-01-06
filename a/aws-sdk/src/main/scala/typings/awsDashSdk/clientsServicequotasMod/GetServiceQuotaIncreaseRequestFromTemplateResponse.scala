package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {
  /**
    * This object contains the details about the quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.native
}

object GetServiceQuotaIncreaseRequestFromTemplateResponse {
  @scala.inline
  def apply(ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate = null): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceQuotaIncreaseRequestInTemplate != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(ServiceQuotaIncreaseRequestInTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateResponse]
  }
}

