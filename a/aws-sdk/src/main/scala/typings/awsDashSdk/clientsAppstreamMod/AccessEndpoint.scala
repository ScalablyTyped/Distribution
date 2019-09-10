package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessEndpoint extends js.Object {
  /**
    * The type of interface endpoint.
    */
  var EndpointType: AccessEndpointType
  /**
    * The identifier (ID) of the VPC in which the interface endpoint is used.
    */
  var VpceId: js.UndefOr[String] = js.undefined
}

object AccessEndpoint {
  @scala.inline
  def apply(EndpointType: AccessEndpointType, VpceId: String = null): AccessEndpoint = {
    val __obj = js.Dynamic.literal(EndpointType = EndpointType.asInstanceOf[js.Any])
    if (VpceId != null) __obj.updateDynamic("VpceId")(VpceId)
    __obj.asInstanceOf[AccessEndpoint]
  }
}

