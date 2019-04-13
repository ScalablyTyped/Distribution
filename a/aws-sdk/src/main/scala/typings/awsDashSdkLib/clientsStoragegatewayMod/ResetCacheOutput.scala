package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetCacheOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object ResetCacheOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): ResetCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[ResetCacheOutput]
  }
}

