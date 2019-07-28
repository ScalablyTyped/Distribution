package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinDomainOutput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
    */
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}

object JoinDomainOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): JoinDomainOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[JoinDomainOutput]
  }
}

