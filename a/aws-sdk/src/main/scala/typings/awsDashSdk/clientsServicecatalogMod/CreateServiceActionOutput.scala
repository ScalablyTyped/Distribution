package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceActionOutput extends js.Object {
  /**
    * An object containing information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ServiceActionDetail] = js.native
}

object CreateServiceActionOutput {
  @scala.inline
  def apply(ServiceActionDetail: ServiceActionDetail = null): CreateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (ServiceActionDetail != null) __obj.updateDynamic("ServiceActionDetail")(ServiceActionDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceActionOutput]
  }
}

