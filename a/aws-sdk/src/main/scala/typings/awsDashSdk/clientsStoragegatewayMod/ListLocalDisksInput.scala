package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocalDisksInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object ListLocalDisksInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): ListLocalDisksInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[ListLocalDisksInput]
  }
}

