package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLocalConsolePasswordOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object SetLocalConsolePasswordOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): SetLocalConsolePasswordOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[SetLocalConsolePasswordOutput]
  }
}

