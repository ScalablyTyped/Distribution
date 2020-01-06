package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends js.Object {
  /**
    * A structure that contains information about one service quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.native
}

object PutServiceQuotaIncreaseRequestIntoTemplateResponse {
  @scala.inline
  def apply(ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate = null): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceQuotaIncreaseRequestInTemplate != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(ServiceQuotaIncreaseRequestInTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateResponse]
  }
}

