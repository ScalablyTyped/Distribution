package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableGatewayOutput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) of the disabled gateway.
    */
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object DisableGatewayOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): DisableGatewayOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[DisableGatewayOutput]
  }
}

