package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends js.Object {
  /**
    * A structure that contains information about one service quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate] = js.undefined
}

object PutServiceQuotaIncreaseRequestIntoTemplateResponse {
  @scala.inline
  def apply(ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate = null): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceQuotaIncreaseRequestInTemplate != null) __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(ServiceQuotaIncreaseRequestInTemplate)
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateResponse]
  }
}

