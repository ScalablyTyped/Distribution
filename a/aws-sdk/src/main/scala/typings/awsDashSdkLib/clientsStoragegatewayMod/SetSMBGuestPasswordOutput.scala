package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSMBGuestPasswordOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object SetSMBGuestPasswordOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): SetSMBGuestPasswordOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[SetSMBGuestPasswordOutput]
  }
}

