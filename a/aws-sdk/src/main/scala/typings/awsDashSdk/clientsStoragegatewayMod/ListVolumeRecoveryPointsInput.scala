package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumeRecoveryPointsInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object ListVolumeRecoveryPointsInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): ListVolumeRecoveryPointsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[ListVolumeRecoveryPointsInput]
  }
}

