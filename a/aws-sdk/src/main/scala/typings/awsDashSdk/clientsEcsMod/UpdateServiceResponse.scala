package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceResponse extends js.Object {
  /**
    * The full description of your service following the update call.
    */
  var service: js.UndefOr[Service] = js.native
}

object UpdateServiceResponse {
  @scala.inline
  def apply(service: Service = null): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceResponse]
  }
}

