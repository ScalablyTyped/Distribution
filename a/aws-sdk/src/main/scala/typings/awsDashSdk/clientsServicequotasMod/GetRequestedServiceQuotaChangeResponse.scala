package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestedServiceQuotaChangeResponse extends js.Object {
  /**
    * Returns the RequestedServiceQuotaChange object for the specific increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.native
}

object GetRequestedServiceQuotaChangeResponse {
  @scala.inline
  def apply(RequestedQuota: RequestedServiceQuotaChange = null): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestedQuota != null) __obj.updateDynamic("RequestedQuota")(RequestedQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
}

