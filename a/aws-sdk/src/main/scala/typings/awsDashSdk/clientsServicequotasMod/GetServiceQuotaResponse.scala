package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaResponse extends js.Object {
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.undefined
}

object GetServiceQuotaResponse {
  @scala.inline
  def apply(Quota: ServiceQuota = null): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (Quota != null) __obj.updateDynamic("Quota")(Quota)
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
}

