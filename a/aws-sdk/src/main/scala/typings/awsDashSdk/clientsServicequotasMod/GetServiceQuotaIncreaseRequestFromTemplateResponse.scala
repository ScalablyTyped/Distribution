package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {
  /**
    * This object contains the details about the quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.undefined
}

object GetServiceQuotaIncreaseRequestFromTemplateResponse {
  @scala.inline
  def apply(ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate = null): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceQuotaIncreaseRequestInTemplate != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(ServiceQuotaIncreaseRequestInTemplate)
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateResponse]
  }
}

