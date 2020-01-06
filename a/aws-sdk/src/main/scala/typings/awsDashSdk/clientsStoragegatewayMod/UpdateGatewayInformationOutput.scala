package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayInformationOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.native
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
}

object UpdateGatewayInformationOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, GatewayName: String = null): UpdateGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationOutput]
  }
}

