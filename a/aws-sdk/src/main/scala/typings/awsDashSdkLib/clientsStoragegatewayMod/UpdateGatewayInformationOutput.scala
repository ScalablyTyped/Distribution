package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGatewayInformationOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateGatewayInformationOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, GatewayName: java.lang.String = null): UpdateGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName)
    __obj.asInstanceOf[UpdateGatewayInformationOutput]
  }
}

