package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestServiceQuotaIncreaseResponse extends js.Object {
  /**
    * Returns a list of service quota requests.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}

object RequestServiceQuotaIncreaseResponse {
  @scala.inline
  def apply(RequestedQuota: RequestedServiceQuotaChange = null): RequestServiceQuotaIncreaseResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestedQuota != null) __obj.updateDynamic("RequestedQuota")(RequestedQuota)
    __obj.asInstanceOf[RequestServiceQuotaIncreaseResponse]
  }
}

