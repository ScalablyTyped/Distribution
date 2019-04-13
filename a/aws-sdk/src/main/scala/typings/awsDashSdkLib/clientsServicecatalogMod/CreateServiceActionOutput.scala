package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceActionOutput extends js.Object {
  /**
    * An object containing information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
}

object CreateServiceActionOutput {
  @scala.inline
  def apply(ServiceActionDetail: ServiceActionDetail = null): CreateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (ServiceActionDetail != null) __obj.updateDynamic("ServiceActionDetail")(ServiceActionDetail)
    __obj.asInstanceOf[CreateServiceActionOutput]
  }
}

