package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceResponse extends js.Object {
  /**
    * The full description of the deleted service.
    */
  var service: js.UndefOr[Service] = js.undefined
}

object DeleteServiceResponse {
  @scala.inline
  def apply(service: Service = null): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[DeleteServiceResponse]
  }
}

