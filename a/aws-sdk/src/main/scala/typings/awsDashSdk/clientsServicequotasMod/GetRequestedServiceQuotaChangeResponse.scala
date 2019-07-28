package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRequestedServiceQuotaChangeResponse extends js.Object {
  /**
    * Returns the RequestedServiceQuotaChange object for the specific increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}

object GetRequestedServiceQuotaChangeResponse {
  @scala.inline
  def apply(RequestedQuota: RequestedServiceQuotaChange = null): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestedQuota != null) __obj.updateDynamic("RequestedQuota")(RequestedQuota)
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
}

