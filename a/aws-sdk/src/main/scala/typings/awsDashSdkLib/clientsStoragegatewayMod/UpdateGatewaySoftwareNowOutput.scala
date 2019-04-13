package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGatewaySoftwareNowOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object UpdateGatewaySoftwareNowOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): UpdateGatewaySoftwareNowOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
  }
}

