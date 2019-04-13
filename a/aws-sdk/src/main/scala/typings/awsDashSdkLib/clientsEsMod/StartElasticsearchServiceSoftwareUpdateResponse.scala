package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
}

object StartElasticsearchServiceSoftwareUpdateResponse {
  @scala.inline
  def apply(ServiceSoftwareOptions: ServiceSoftwareOptions = null): StartElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSoftwareOptions != null) __obj.updateDynamic("ServiceSoftwareOptions")(ServiceSoftwareOptions)
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
  }
}

