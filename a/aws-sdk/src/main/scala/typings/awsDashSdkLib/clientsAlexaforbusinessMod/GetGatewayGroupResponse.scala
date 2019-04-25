package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayGroupResponse extends js.Object {
  var GatewayGroup: js.UndefOr[GatewayGroup] = js.undefined
}

object GetGatewayGroupResponse {
  @scala.inline
  def apply(GatewayGroup: GatewayGroup = null): GetGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroup != null) __obj.updateDynamic("GatewayGroup")(GatewayGroup)
    __obj.asInstanceOf[GetGatewayGroupResponse]
  }
}

