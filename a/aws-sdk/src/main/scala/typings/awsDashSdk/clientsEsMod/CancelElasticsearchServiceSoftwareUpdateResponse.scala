package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsDashSdk.clientsEsMod.ServiceSoftwareOptions] = js.undefined
}

object CancelElasticsearchServiceSoftwareUpdateResponse {
  @scala.inline
  def apply(ServiceSoftwareOptions: ServiceSoftwareOptions = null): CancelElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSoftwareOptions != null) __obj.updateDynamic("ServiceSoftwareOptions")(ServiceSoftwareOptions)
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
  }
}

