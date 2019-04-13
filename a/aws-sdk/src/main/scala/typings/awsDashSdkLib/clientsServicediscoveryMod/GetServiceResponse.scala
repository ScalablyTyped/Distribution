package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceResponse extends js.Object {
  /**
    * A complex type that contains information about the service.
    */
  var Service: js.UndefOr[Service] = js.undefined
}

object GetServiceResponse {
  @scala.inline
  def apply(Service: Service = null): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (Service != null) __obj.updateDynamic("Service")(Service)
    __obj.asInstanceOf[GetServiceResponse]
  }
}

