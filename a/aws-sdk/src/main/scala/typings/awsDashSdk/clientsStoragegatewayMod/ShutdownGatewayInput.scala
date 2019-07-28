package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShutdownGatewayInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object ShutdownGatewayInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): ShutdownGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[ShutdownGatewayInput]
  }
}

